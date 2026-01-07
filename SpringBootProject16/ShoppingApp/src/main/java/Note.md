1: If you use @RequestMapping("api") annotation on top of the controller class then every url containing "api" will come to this controller only.
2: If you want to send custom Http status code the use ResponseEntity. Return actual data and HttpStatusCode inside ResponseEntity Constructor.
3: @GeneratedValue(strategy = GenerationType.IDENTITY) This annotation in Product class will create a primary key using the product Id and will create new Product ID every time just by incrementing it.
4:     @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy") This annotation at releaseDate varialbe in product class will define the pattern of date in which it will be returned.
5: @Lob tells the JPA provider (Hibernate, EclipseLink, etc.) to store a field as a large data type, suitable for storing very large text or binary data.

LOB = Large OBject

6: ResponseEntity<?>  give flexibility to return any response type.
7: @RequestPart annotation is used when we are getting data in multiple variable. Eg: In addProduct method we are sending image and product details separately so we are using annotation @RequestPart because @RequestBody will take it all together.
8: For accepting image we have to use MultipartFile
9: We will fetch product details and product image separately and image will be returned in the form of byte[].

10: If you are calling backend api from frontend like this: `http://localhost:8080/api/products/search?keyword=${value}  then use @RequestParam annotation in method to accept keyword value which is getting passed. Use the parameter name same as what is passing in the api which in this case is "keyword"; If is not same then backend method will not accept data.
11: Use @Query annotation when you are writing your own query in repo under JPA interface.
12: Whenever you are getting warning for Large Object auto commit use the below line in application.properties file:
spring.datasource.hikari.auto-commit=false

13: A DTO (Data Transfer Object) is a simple object used to carry data between layers of an application, especially between the backend and frontend, controller and service, or over the network. It contains only data, no business logic.