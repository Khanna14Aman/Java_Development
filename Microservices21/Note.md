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

5: Now First you have to run Eureka server and open the port where Eureka server is running, now when you run the Question service it will start reflecting on "Instance reflecting on Eureka server". Because in Pom.xml file of Question service there is Eureka Client Dependency is added so Question service is registered as a client in Eureka.

6: Same as Quiz service will also get registered as a Eureka Client.
7: Now in Quiz service you have to create a Interface by which you will fetch the data from Question service using Question service API's.
8: use annotation @FeignClient("Name of Service whose api you want to hit");
9: Inside interface mentioned all the method declaration of the service which you want to use.

10: The @ElementCollection annotation tells JPA to store this collection of integers in a
 separate table that's linked to the Quiz table, rather than trying to establish entity
 relationships. So we have used this in Quiz Model for fetching list of question number.

 11: Use annotation @EnableFeignClients above the main class of Quiz to enable this service as a Feign Client.

12: So now we have multiple services running parallelerly and we need to call each of them using there API's but this is not feasible to use, what if we have more than 10 services then every time we have to call different API's with different port numbers. 
So, using API gateway we will call only one endpoint using only 1 port number and from there every other services gets call.
13: For API Gateway we have to create one more microservices with dependencies Eureka client, and Cloud Gateway.
14: Now in application.properties file add below instructions;

spring.application.name=apigateway => Defining API-Gateway service name

server.port=8765  => defining port number


spring.cloud.gateway.discovery.locator.enabled=true
Enables automatic route creation in Spring Cloud Gateway based on services registered in Eureka (or any DiscoveryClient).


spring.cloud.gateway.discovery.locator.lower-case-service-id=true
Forces Gateway to expose routes using lowercase service IDs in URLs.
Why this exists
Eureka registers services in UPPERCASE
URLs are usually lowercase
Case-sensitive URLs cause 404 issues
