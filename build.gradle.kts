plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/com.microsoft.playwright/playwright
    implementation("com.microsoft.playwright:playwright:1.44.0")
// https://mvnrepository.com/artifact/io.cucumber/cucumber-java
    implementation("io.cucumber:cucumber-java:7.18.0")
// https://mvnrepository.com/artifact/org.testng/testng
    implementation("org.testng:testng:7.10.2")

}

tasks.test {
    useTestNG()
}