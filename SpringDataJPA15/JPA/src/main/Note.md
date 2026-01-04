1: Spring JPA stands for Java Persistence API
2: It eliminates boilerplate code for CRUD operations and integrates seamlessly with ORM frameworks like Hibernate.
3: ORM stands for Object Relational Mapping
4: If you are using normal jdbc then you have to write every sql query manually to work with relational database. But if you want that table gets created with name as your class name and column name same a instance variable name of class then we need to use ORM technique.
5: Some of the famous ORM tools are Hibernate(most used), OpenJPa, EclipseLink, etc.

Spring Data JPA itself is not an ORM tool.
It uses a JPA implementation (ORM provider) underneath.
By default, this is Hibernate.

6: while creating project add dependency like spring data jpa and postgresql jdbc driver.
7: spring.datasource.url=jdbc:postgresql://localhost:1024/SpringJPA  => this will define path to database where we want to work
   spring.datasource.username=postgres  => username for using database
   spring.datasource.password=aman  => password
   spring.datasource.driver-class-name=org.postgresql.Driver   => Defining driver for using database

8: spring.jpa.hibernate.ddl-auto=update  => this line will check if table exits then update the table else create the table.  If we use create instead of update then every time table will get created and delete existing table.
   spring.jpa.show-sql=true  => will print queries in console.

9: @Component will let spring manage that object, @Entity will let spring create table of same class with name as class name, @ID define primary key of table
10: Instead of creating repository class create repository interface and extend JpaRepository interface. First parameter means which entity it has to manage and type of primary key

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
This code defines a Spring Data JPA Repository for managing Student entities.
It provides ready-to-use database operations without writing any implementation code.

10: Spring Data JPA provides some internal method as well according to your instance variables. Eg:
If you have instance variable marks, then JPA will provide methods like findBYMarks(), findByMarksGreaterThan(), findByMarksGreaterThanEqual(), or findByMarksBetween(int ,int );
So JPA will provide some extra methods for instance variable which we generally used in query like >, >=, between. etc.

11: repo.save(object); will first try to find the entry in table if exist then update that entry else create a new entry in table.
12: delete(object) will delete the entry in table matching with primary key of table.

13: Use @Query annotation for defining custom query
14: JPA worked on Repository Pattern
15: By using the Pageable interface, you effectively enable pagination in Spring Data JPA, allowing for more efficient data retrieval and management of large datasets. This approach aligns with the objective of understanding how Spring Data JPA handles pagination, ensuring you can implement it correctly in your applications.

16: findById() method object of optional type then we have to convert it to entity type.