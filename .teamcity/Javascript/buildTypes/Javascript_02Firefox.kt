package Javascript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object Javascript_02Firefox : BuildType({
    template(Javascript.buildTypes.Javascript_Template)
    uuid = "325f18f1-6551-4a82-b357-08bef29fd9ed"
    id = "Javascript_02Firefox"
    name = "02. Firefox"

    params {
        param("Browser", "Firefox")
    }

    dependencies {
        dependency(Javascript.buildTypes.Javascript_01FastTests) {
            snapshot {
            }
        }
    }
})
