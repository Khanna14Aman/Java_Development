1: Spring Data Rest allows you to remove Controller and Service class and still work with repo layer, but limited crud operations will be possible else you have to define method in repo class.
2: Spring Data REST is a Spring framework module that automatically exposes REST APIs for your Spring Data repositories—without writing controllers.
3: How It Works (Behind the Scenes)

Spring scans JpaRepository interfaces

Exposes CRUD endpoints using HATEOAS

Serializes entities as JSON

Supports pagination, sorting, searching out of the box

4: Steps to create Spring Data JPA project: 
    a: Create Spring Boot project
    b: Add dependency like lombok, postgres jdbc driver, Spring JPA, Rest Repository.
