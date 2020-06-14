const {override, fixBabelImports, addLessLoader} = require('customize-cra')

module.exports = override(
    // 针对antd进行按需打包
    fixBabelImports('imports', {
        libraryName: 'antd',
        libraryDirectory: 'es',
        style: true
    }),
    addLessLoader({
        lessOptions: {
            javascriptEnabled: true,
            modifyVars: {
                '@primary-color': '#1DA57A'
            }
        }
    })
)