const isProd = process.env.NODE_ENV === 'production'

const devUrl = '/'
const prodUrl = '/'

const api = isProd ? prodUrl : devUrl

export default {
  isProd,
  api
}
