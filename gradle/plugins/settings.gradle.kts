dependencyResolutionManagement {
    repositories.mavenCentral()
    repositories.gradlePluginPortal()
    includeBuild("../platform")
}

include("java-convention")
include("lifecycle")
include("packaging")
include("publication")
include("versioning")
