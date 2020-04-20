plugins {
    id 'org.jetbrains.kotlin.jvm' version '1.3.31'
}

group 'com.yechangqing'
version '1.0.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
}

compileKotlin {
    kotlinOptions.jvmTarget = "1.8"
}
compileTestKotlin {
    kotlinOptions.jvmTarget = "1.8"
}