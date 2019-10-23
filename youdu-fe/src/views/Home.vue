<template>
  <div class="home">
    <img class="image-container" alt="Emmmm" src="../assets/logo.jpg">
    <div class="copyright-container">&copy; 2019 youdushufang.com</div>
  </div>
</template>

<script>
export default {
  name: 'home'
}
</script>

<style scoped lang="stylus">
.home
  display flex
  flex-direction column
  align-items center
  justify-content center
.image-container
  width 600px
.copyright-container
  padding-top 10px
  font-size 14px
  color #999999
</style>
