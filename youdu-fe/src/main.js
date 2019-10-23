import Vue from 'vue'
import App from './App.vue'
import router from './router'
import serverConfig from '../server-config'
import store from './store'

Vue.config.productionTip = false
Vue.prototype.$serverConfig = serverConfig

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
