<template>
  <div class="home">
    <img class="logo-image" alt="youdushufang" src="../assets/logo.jpg">
    <HelloWorld msg="youdushufang is conming soon..."></HelloWorld>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'home',
  components: {
    HelloWorld
  }
}
</script>

<style scoped lang="stylus">
.home
  display flex
  justify-content center
  align-items center
.logo-image
  width 260px
  padding-right 30px
</style>
