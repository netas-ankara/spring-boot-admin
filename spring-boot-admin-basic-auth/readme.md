# Synopsis

Spring Boot Admin Server-Client applications with basic authentication. Due to version collisions btw Spring Boot 2.0.1 and Spring Boot Admin 2.0.0-SNAPSHOT, previous stable releases were used.

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

### Spring Boot Admin Server Properties

//supresses default security username and password. These credentials will be used to login server console  
//comment the lines below to use auto generated security key as password and "user" as the username  
security.user.name=serveradmin  
security.user.password=serveradmin  

//enable security  
management.security.enabled=true  


### Spring Boot Admin Client Properties

//supresses default security username and password. These credentials will be used to login client  
//comment the lines below to use auto generated security key as password and "user" as the username  
security.user.name=client  
security.user.password=client  

//client runs on  
server.port=8081  

//spring boot admin server url  
spring.boot.admin.url=http://localhost:8080  

//enable security
management.security.enabled=true  

//providing client credentials to spring boot admin server so that it can connect to client end points securely  
spring.boot.admin.client.metadata.user.name=${security.user.name}  
spring.boot.admin.client.metadata.user.password=${security.user.password}  

//server credentials are needed in order to register client app to server  
spring.boot.admin.username=serveradmin  
spring.boot.admin.password=serveradmin  

//debug level allows us to observe periodic communication btw client and server  
logging.level.org.springframework.web: DEBUG  

## Built With

* [Spring Boot 1.5.12-RELEASE](https://start.spring.io/)
* [Spring Boot Admin 1.5.7](https://oss.sonatype.org/content/repositories/snapshots/de/codecentric/spring-boot-admin-starter-server/)

## Known Issues

* Maven build with test succedes with "java.lang.IllegalStateException: service-base-url must be set when deployed to servlet-container" error

## Future Work
* Using Spring Boot 2.0.1 and Spring Boot Admin 2.0.0-SNAPSHOT causes login trouble for Spring Boot Admin Console. Fix it!
* Add some services and create a load test to observe meaninful metrics on admin console
* Notification integration using mail, slack
* JWT integration
* Spring Cloud integration