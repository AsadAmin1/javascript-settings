package Javascript

import Javascript.buildTypes.*
import Javascript.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "0cc01acd-f36d-463f-a3a1-6ee65e3889a0"
    id = "Javascript"
    parentId = "_Root"
    name = "Javascript"

    vcsRoot(Javascript_HttpsGithubComG0t4teamcityCourseCards)

    buildType(Javascript_02Firefox)
    buildType(Javascript_01FastTests)
    buildType(Javascript_02Chrome)
    buildType(Javascript_03DeployToStaging)

    template(Javascript_Template)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "HttpsGithubComAsadAmin1javascriptSettingsGit"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
