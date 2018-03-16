package Javascript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object Javascript_Template : Template({
    uuid = "b021f1c3-5e70-4d07-b607-1240ef99dfac"
    id = "Javascript_Template"
    name = "Template"

    vcs {
        root(Javascript.vcsRoots.Javascript_HttpsGithubComG0t4teamcityCourseCards)

    }

    steps {
        script {
            name = "Restore NPM Packages"
            id = "RUNNER_5"
            scriptContent = "npm install"
        }
        script {
            name = "Browser Test"
            id = "RUNNER_6"
            scriptContent = "npm test -- --single-run --browsers %Browser% --colors false --reporters teamcity"
        }
        stepsOrder = arrayListOf("RUNNER_5", "RUNNER_6")
    }

    triggers {
        vcs {
            id = "vcsTrigger"
            branchFilter = ""
        }
    }
})
