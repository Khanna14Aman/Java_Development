1: Microservices is a architecture where we break down the large application into smaller one and run each module separately.
2: Dependencies needs to be added: Lombok, spring jpa, spring web, postgresql driver, Open Feign, Eureka discovery client.

Open Feign=> This we use to call API of anyother services from particular service. Eg: From Quiz service we are calling api of Question service to get list of questions.

Eureka Server=> It is a common server where we register our services so that our services can be called from other services.

3: For Eureka Server we have to create new project with dependencies spring web and Eureka Server.

4: In Eureka Server Project add annotation above main method @EnableEurekaServer and in application.properties file add below code
spring.application.name=EurekaServer
server.port=8761  => This is default client as well.

eureka.instance.hostname=localhost    =>   Defines the hostname under which this Eureka instance isregistered


eureka.client.fetch-registry=false:
Prevents this application from fetching the registry.
Explanation:
Eureka servers are also Eureka clients by default
A standalone Eureka Server does not need to fetch registry data
Setting it to false avoids unnecessary network calls.


eureka.client.register-with-eureka=false
Prevents the Eureka Server from registering itself as a client.
This is required when running a single Eureka Server.
If you were running multiple Eureka Servers (cluster), this might be true.