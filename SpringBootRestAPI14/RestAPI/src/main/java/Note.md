Steps for creating restAPI:
1: Create SpringBoot project from start.spring.io and add dependency spring web which provides embedded tomcat server and lombok which helps in writing less code.
2: Here we are not working with JSP so no need of webApp folder and no need of any jsp dependency.
3: If controller is returning any data for any api then use annotation @ReponseBody for that method along with @Controller at class Or just use annotation @RestController at class then you don't need to maintain @ResponseBody annotation.
4: Full form of Rest is Representational State Transfer. Because whenever we hit any api, Rest API will send the current data which is termed as state of that and it will send in a representational way.
5: We have to use @CrossOrigin(origins = "link from where requesting API is allowed") so that frontend system can also hit the API and fetch the data.
6: If you have to return data to frontend then use annotation @ResponseBody above your method.
7: If you have to receive data from frontend to work on that then use annotation @RequestBody in method parameter and define parameter of data as well.
8: If you have to fetch data from url only then use annotation @PathVariable along with the name of that variable in url.
9: By default controller will accept and return data in the form of JSON this is because of spring jackson dependency but if you want to use other data format also like xml then add dependency "jackson xml". And if you want to return data in form of xml then set header as accept and key as "application/xml" in postman
10: In Mapping annotation you can mention in which format you want to send or recieve data using attribute "Produces" to define the data type of response and "Consumes" to define the data type of requested data.