package Javascript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object Javascript_01FastTests : BuildType({
    template(Javascript.buildTypes.Javascript_Template)
    uuid = "02f52c1d-a2d6-443e-a203-21468c2322a2"
    id = "Javascript_01FastTests"
    name = "01.Fast Tests"

    params {
        param("Browser", "PhantomJS")
    }
})
