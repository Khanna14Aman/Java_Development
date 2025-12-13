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

12: @OneToMany 
    private List<Laptop1toMany> laptop1toManyList; 
    // Here annotation will try to create one to many releation with laptops but in table student sid is primary so when it will try to create a one to many records of same student with multiples laptop then student ID will get repeated and as primary key it shouldn't happen so it will create separate table with column student ID and laptop ID.

13:     @OneToMany(mappedBy = "student1toMany2") // This is indicating that in Student table we don't need to create column of laptop It will be create by "student1toMany2" instance variable of Laptop Class in laptop table. Here we are tetting Student class that it is laptop class responsibility to map in the table not youra.
    private List<Laptop1toMany2> laptop1toManyList;


14: Hibernate provides caching at 2 level L1 and L2:
    L1 caching useful for same session, eg you save data in data base and in same session you are fetching same data then hibernate will not file select query on database. Data will be available in same session cache. Or if you have fetched data from database then it will fire select query if again you try to fetch data from same session it will not fire select query on database.

    L2 caching is helpful in sharing same data in different session using some libraries like EHCache, Caffiene

15: Hibernate Eager and Lazy Fetch: Let say you are fetching data for Student and that student is having Collection of laptop as well whose data is stored on laptop table. So by default if you don't use value of laptop then hibernate will only fire select query on student not on laptop and if you use laptop value as well from student object then it will fire select query on laptop query as well. So this is called lazy loading.
16: In eager loading whether you use laptop object or not it will fire the query on laptop table also.

17: HQL is case-sesitive. You must use Java entity property names.  Spelling must exactly match the field name

18: For fetching data if you are using session.find() method then select query will get fired whether you are using that value or not.
19: For fetching data if you are using session.getReference() method then select query will only get fired if you are using that value else select query will not get fired.

20: Hibernate does NOT enable Level-2 cache by default.