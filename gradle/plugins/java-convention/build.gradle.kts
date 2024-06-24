plugins {
    `kotlin-dsl`
}

group = "com.example.buildlogic"

dependencies {
    implementation(project(":versioning"))

    implementation(libs.guava) // example of using a standard Java library in your plugins
    implementation(libs.gradlex.jvm.dependency.conflict.resolution) // example of using a Gradle community plugin
}
