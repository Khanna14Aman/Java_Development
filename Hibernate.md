1: Hibernate is a Java-based ORM (Object–Relational Mapping) framework that helps developers        interact with databases without writing a lot of SQL code.

2: For hibernate we have to define property of hibernate in xml file under resource folder.

3: Transaction is required for making changes in table data, not for fetching data from table.

4: Merge query will fire select query first if data found from database then it will update else it will create a new entry.

5: In hibernate.cfg.xml file <property name = "hibernate.hbm2ddl.auto">create</property> will drop the existing table and will create a new table data will be lost.

6: In hibernate.cfg.xml file <property name = "hibernate.hbm2ddl.auto">update</property> will update the table if existing else create a new table.

7: @Column(name = "name") this annotation above any variable will create a new column in table with name given in annotation if doesn't exist.
8: @Transient this annotation will help in not creating the column for particular variable.
9: @Table(name = "alien") will create the new table with the name given in annotation if not exist. 

10: @Embeddable this annotation is used to add column of this class variable as a table column in any of existing table.

11: For one to one relationship use @OneToOne to the instance variable with whom you want one to one relationship;
Eg If Student class has @OneToOne relationship with Laptop then in Student table above Laptop instance variable use @OneToOne so Student table will have the primary key of Laptop as Foreign Key in table.