<template>
  <div class="hello">
    <div class="title-container">{{ msg }}</div>
    <div class="button-container">
      <el-button type="text" @click="getName()">
        What's your name, Han Meimei?
      </el-button>
      <div class="line-contianer"></div>
      <el-button type="text" @click="burn()">
        Burn something to have some fun!
      </el-button>
      <div class="line-contianer"></div>
      <el-button type="text" @click="haveFun()">
        Or you can just have some fun.
      </el-button>
    </div>
    <div class="copyright-container">&copy; 2019 youdushufang.com</div>
  </div>
</template>

<script>
import { Button } from 'element-ui'

export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  components: {
    'el-button': Button
  },
  methods: {
    getName () {
      this.$api.name().then(data => {
        this.$util.message.success('My name is ' + data + '.')
      })
    },
    burn () {
      this.$api.burn().then(data => {
        this.$util.message.success('Amazing! ' + data)
      })
    },
    haveFun () {
      this.$api.haveFun().then(data => {
        this.$util.message.success('Amazing! ' + data)
      })
    }
  }
}
</script>

<style scoped lang="stylus">
.title-container
  margin-bottom 10px
  font-size 38px
  font-weight 400
  font-color #333
.hello
  display flex
  flex-direction column
  align-items center
.button-container
  display flex
  align-items center
.line-contianer
  background-color #bebebe
  width 1px
  height 12px
  margin 0 10px
.copyright-container
  padding-top 10px
  font-size 12px
  color #999999
</style>
