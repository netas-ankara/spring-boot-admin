![](./images/logo-spring-boot-admin.png)

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

## Future Work
* Using Spring Boot 2.0.1 and Spring Boot Admin 2.0.0-SNAPSHOT causes login trouble for Spring Boot Admin Console. Fix it!
* Add some services and create a load test to observe meaninful metrics on admin console
* Notification integration using mail, slack
* JWT integration
* Spring Cloud integration