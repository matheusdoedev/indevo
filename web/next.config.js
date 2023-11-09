const path = require('path')

const nextConfig = {
  sassOptions: {
    includePaths: [path.join(__dirname, 'src', 'styles')]
  }
}

module.exports = nextConfig
