1: Inversion of Control is a design principle where the control of object creation, lifecycle, and dependency management is inverted from the application code to a framework or container.

2: Dependency Injection is a design pattern used to implement IoC.
It is the mechanism by which dependencies are supplied to an object.

3: Any object which is created or manage by spring is call BEANS

4: Any object created by Spring is available in special container. This is a special area or block in JVM where objects are available.

5: Use @Component annotation above the class whose object you want to get from container and use Dependency Injection for that. And if you want to crete object of any class inside any other class object then use @Autowired annotation above that instance variable which will be a object of another class.