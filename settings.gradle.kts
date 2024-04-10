pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "RCDA31"
include(":app")
include(":mod3demo1")
include(":mod3tp1")
include(":mod4demo1")
include(":mod4demo2")
include(":mod4demo3")
include(":mod4demo4")
include(":mod5demo1")
