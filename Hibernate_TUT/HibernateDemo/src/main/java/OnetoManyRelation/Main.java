package OnetoManyRelation;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {
    public static void main(String [] args){
        Laptop1toMany laptop1toMany1 = new Laptop1toMany();
        laptop1toMany1.setLattopId(101);
        laptop1toMany1.setLaptopBrand("Asus");
        laptop1toMany1.setLaptopName("zohi");

        Laptop1toMany laptop1toMany2 = new Laptop1toMany();
        laptop1toMany2.setLattopId(102);
        laptop1toMany2.setLaptopBrand("dell");
        laptop1toMany2.setLaptopName("Dello Xpedia");

        Laptop1toMany laptop1toMany3 = new Laptop1toMany();
        laptop1toMany3.setLattopId(103);
        laptop1toMany3.setLaptopBrand("HP");
        laptop1toMany3.setLaptopName("Pavillion");

        Student1toMany student1toMany1 = new Student1toMany();
        student1toMany1.setSid(101);
        student1toMany1.setName("Rohit");
        student1toMany1.setLaptop1toManyList(Arrays.asList(laptop1toMany1,laptop1toMany2));

        Student1toMany student1toMany2 = new Student1toMany();
        student1toMany2.setSid(102);
        student1toMany2.setName("Ayush");
        student1toMany2.setLaptop1toManyList(Arrays.asList(laptop1toMany3));

        SessionFactory sessionFactory = new Configuration().addAnnotatedClass(Student1toMany.class).addAnnotatedClass(Laptop1toMany.class).configure("hibernate.cfg2.xml").buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(laptop1toMany1);
        session.persist(laptop1toMany2);
        session.persist(laptop1toMany3);
        session.persist(student1toMany1);
        session.persist(student1toMany2);

        transaction.commit();

        session.close();;
        sessionFactory.close();
    }
}
