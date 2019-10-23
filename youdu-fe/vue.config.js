module.exports = {
    publicPath: "/",
    devServer: {
      port: 8000,
      proxy: {
        '/api': {
          target: 'http://127.0.0.1:9090',
          changeOrigin: true
        }
      }
    }
  };