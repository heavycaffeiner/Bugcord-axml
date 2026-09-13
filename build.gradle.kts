group = "com.bugcord"
version = "1.0.1"

plugins {
    id("java-library")
    id("maven-publish")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.slf4j:slf4j-api:2.0.1")
}

java {
    withSourcesJar()
}

publishing {
    publications {
        register("axml", MavenPublication::class) {
            artifactId = "axml"
            artifact(tasks["jar"])
            artifact(tasks["sourcesJar"])
        }
    }

    repositories {
        mavenLocal()
    }
}
