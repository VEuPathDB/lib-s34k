import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version "1.6.20"
  id("org.jetbrains.dokka") version "1.6.10"
  `java-library`
  `maven-publish`
}

group = "org.veupathdb.lib.s3"
version = "0.7.1"

java {
  sourceCompatibility = JavaVersion.VERSION_1_8
  targetCompatibility = JavaVersion.VERSION_1_8

  withSourcesJar()
  withJavadocJar()
}

repositories {
  mavenCentral()
}

dependencies {
  implementation(kotlin("stdlib"))
  implementation(kotlin("stdlib-jdk8"))
  implementation("org.slf4j:slf4j-api:1.7.36")

  testImplementation(kotlin("test"))
}

tasks.dokkaHtml {
  outputDirectory.set(file("docs/dokka"))
}

tasks.dokkaJavadoc {
  outputDirectory.set(file("docs/javadoc"))
}

task("docs") {
  dependsOn("dokkaHtml", "dokkaJavadoc")
}

tasks.test {
  useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
  kotlinOptions.jvmTarget = "1.8"
}


publishing {
  repositories {
    maven {
      name = "GitHub"
      url = uri("https://maven.pkg.github.com/VEuPathDB/lib-s34k")
      credentials {
        username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
        password = project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN")
      }
    }
  }

  publications {
    create<MavenPublication>("gpr") {
      from(components["java"])
      pom {
        name.set("Generalized S3 API")
        description.set("Provides a standard API for S3 operations which may be backed by varying implementations.")
        url.set("https://github.com/VEuPathDB/lib-s34k")
        developers {
          developer {
            id.set("epharper")
            name.set("Elizabeth Paige Harper")
            email.set("epharper@upenn.edu")
            url.set("https://github.com/foxcapades")
            organization.set("VEuPathDB")
          }
        }
        scm {
          connection.set("scm:git:git://github.com/VEuPathDB/lib-s34k.git")
          developerConnection.set("scm:git:ssh://github.com/VEuPathDB/lib-s34k.git")
          url.set("https://github.com/VEuPathDB/lib-s34k")
        }
      }
    }
  }
}
