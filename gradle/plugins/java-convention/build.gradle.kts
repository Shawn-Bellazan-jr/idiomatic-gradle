plugins {
    `kotlin-dsl`
}

group = "com.example.buildlogic"

dependencies {
    implementation(project(":versioning"))

    implementation(platform("com.example.idiomatic.gradle:platform"))
    implementation("com.google.guava:guava") // example of using a standard Java library in your plugins
    implementation("org.gradlex:jvm-dependency-conflict-resolution") // example of using a Gradle community plugin
}
