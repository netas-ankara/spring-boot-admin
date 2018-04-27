# Synopsis

Simple Spring Boot Admin Server-Client applications without any security. Just run both and client application will be able to register. Latest Spring Boot and Spring Boot Admin versions used as of April 2018.

server runs on http://localhost:8080

clients runs on http://localhost:8081

It provides the following features for registered application.

* Show health status
* Show details, like
* JVM & memory metrics
* Counter & gauge metrics
* Datasource metrics
* Cache metrics
* Show build-info number
* Follow and download logfile
* View jvm system- & environment-properties
* Support for Spring Cloud's postable /env- &/refresh-endpoint
* Easy loglevel management (currently for Logback only)
* Interact with JMX-beans
* View thread dump
* View traces
* Hystrix-Dashboard integration
* Download heapdump
* Notification on status change (via e-mail, Slack, Hipchat, ...)
* Event journal of status changes (non persistent)

## Properties

Spring Boot Admin Server has no properties set

Spring Boot Admin Client has the following properties set;

//spring boot admin location  
spring.boot.admin.client.url:http://localhost:8080

//if multiple SBA servers exist  
//spring.boot.admin.client.url:http://localhost:8080,http://localhost:8079

//enable all endpoints  
management.endpoints.web.exposure.include:*

//might do something like below to enable specific endpoints  
//management.endpoints.web.exposure.include:info,health,env,metrics,conditions

//client port  
server.port=8081

//http://localhost:8081/actuator/health  
check https://codecentric.github.io/spring-boot-admin/current/ for more properties!  

## Built With

* [Spring Boot 2.0.1](https://start.spring.io/)
* [Spring Boot Admin 2.0.0-SNAPSHOT](https://oss.sonatype.org/content/repositories/snapshots/de/codecentric/spring-boot-admin-starter-server/)

Spring Boot Admin Snapshot builds can be access from the sonatype snapshot repository

```xml
<repository>
	<id>sonatype-nexus-snapshots</id>
	<name>Sonatype Nexus Snapshots</name>
	<url>https://oss.sonatype.org/content/repositories/snapshots/</url>
	<snapshots>
		<enabled>true</enabled>
	</snapshots>
	<releases>
		<enabled>false</enabled>
	</releases>
</repository>
```