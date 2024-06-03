import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	war
	id("org.springframework.boot") version "3.3.0"
	id("io.spring.dependency-management") version "1.1.5"
	kotlin("jvm") version "1.9.24"
	kotlin("plugin.spring") version "1.9.24"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web:3.2.6")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.springframework:spring-jdbc:6.1.8")
	implementation("org.springframework:spring-tx:6.1.8")
	providedRuntime("org.springframework.boot:spring-boot-starter-tomcat:3.3.0")
	providedRuntime("com.h2database:h2")
	testImplementation("org.springframework.boot:spring-boot-starter-test:3.2.6")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	implementation("org.springframework.boot:spring-boot-starter-jdbc:3.3.0")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
