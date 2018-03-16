package Javascript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object Javascript_02Chrome : BuildType({
    template(Javascript.buildTypes.Javascript_Template)
    uuid = "e94d602f-de99-4444-80c4-07d8cf4b57ac"
    id = "Javascript_02Chrome"
    name = "02. Chrome"

    params {
        param("Browser", "Chrome")
    }

    dependencies {
        dependency(Javascript.buildTypes.Javascript_01FastTests) {
            snapshot {
            }
        }
    }
})
