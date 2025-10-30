plugins {
    groovy
    application
    id("com.gradleup.shadow") version "9.1.0"
}

repositories {
    mavenCentral()
    flatDir {
        dirs("lib")
    }
}

base.archivesName.set("gradle-example")

dependencies {
    // Groovy BOM
    implementation(platform("org.apache.groovy:groovy-bom:5.+"))

    // Groovy module dependency
    implementation("org.apache.groovy:groovy-json")

    // Strictly exact version of Maven dependency
    implementation("com.codevineyard:hello-world:1.0.1!!")

    // Dependency from local jar
    implementation(":simple-jar")
}

application {
    mainClass.set("com.adjectivecolournoun.gradle.Greetz")
}
