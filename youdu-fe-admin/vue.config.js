module.exports = {
  publicPath: "/admin/",
  devServer: {
    port: 8010,
    proxy: {
      '/api': {
        target: 'http://127.0.0.1:9090',
        changeOrigin: true
      }
    }
  }
};