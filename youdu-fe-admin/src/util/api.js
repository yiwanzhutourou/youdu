import axios from 'axios'
import { Message, Loading } from 'element-ui'

const api = {
  burn () {
    return post('/burn')
  },

  name () {
    return get('/name')
  },

  haveFun () {
    return get('/fun')
  }
}

const axiosJson = axios.create({
  baseURL: 'admin/api/',
  timeout: 5000,
  withCredentials: true // 是否允许带cookie这些
})

let loadingInstance = null

// 请求拦截（配置请求信息）
const requestInterceptor = {
  before: config => {
    if (loadingInstance === null) {
      loadingInstance = Loading.service({ target: '#main', fullscreen: false })
    }

    return config
  },
  error: error => {
    Message({
      showClose: true,
      message: error,
      type: 'error.data.error.message'
    })
    return Promise.reject(error)
  }
}

// 响应拦截（配置请求回来的信息）
const responseInterceptor = {
  after: response => {
    // 处理响应数据
    if (loadingInstance !== null) {
      loadingInstance.close()
      loadingInstance = null
    }

    if (response.data && response.data.code !== 0) {
      let msg = null
      switch (response.data.code) {
        default:
          msg = response.data.msg || '系统错误'
          Message({
            showClose: true,
            message: msg,
            type: 'error'
          })
      }
    }
    return response
  },
  error: error => {
    // 处理响应失败
    if (loadingInstance !== null) {
      loadingInstance.close()
      loadingInstance = null
    }
    let msg = error.response.data.message || '网络错误，请稍后再试'
    Message({
      showClose: true,
      message: msg,
      type: 'error'
    })

    return Promise.reject(error)
  }
}

// 配置axiosJson拦截器
axiosJson.interceptors.request.use(
  requestInterceptor.before,
  requestInterceptor.error
)

axiosJson.interceptors.response.use(
  responseInterceptor.after,
  responseInterceptor.error
)

/**
 * get 请求方法
 * @param url
 * @param params
 * @returns {Promise}
 */
function get (url, params = {}) {
  return new Promise((resolve, reject) => {
    axiosJson
      .get(url, {
        params: params
      })
      .then(response => {
        resolve(response.data.data)
      })
      .catch(err => {
        reject(err)
      })
  })
}

/**
 * post 请求方法
 * @param url
 * @param params
 * @returns {Promise}
 */
function post (url, params = {}) {
  return new Promise((resolve, reject) => {
    axiosJson.post(url, params).then(
      response => {
        resolve(response.data.data)
      },
      err => {
        reject(err)
      }
    )
  })
}

export default {
  api
}
