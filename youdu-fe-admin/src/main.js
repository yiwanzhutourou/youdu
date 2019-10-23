import { Button } from 'element-ui'
import Vue from 'vue'
import api from './util/api'
import App from './App.vue'
import router from './router'
import serverConfig from '../server-config'
import store from './store'
import util from './util/util'

Vue.config.productionTip = false
Vue.prototype.$api = api.api
Vue.prototype.$serverConfig = serverConfig
Vue.prototype.$util = util.FUNCTIONS

Vue.use(Button)

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
