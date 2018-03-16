package Javascript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object Javascript_03DeployToStaging : BuildType({
    uuid = "aa60db35-0678-4884-a6ff-82467e417302"
    id = "Javascript_03DeployToStaging"
    name = "03. Deploy to Staging"

    vcs {
        root(Javascript.vcsRoots.Javascript_HttpsGithubComG0t4teamcityCourseCards)

    }

    dependencies {
        dependency(Javascript.buildTypes.Javascript_02Chrome) {
            snapshot {
            }
        }
        dependency(Javascript.buildTypes.Javascript_02Firefox) {
            snapshot {
            }
        }
    }
})
