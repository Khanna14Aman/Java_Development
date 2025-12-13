package ManytoManyRelation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {
    public static void main(String [] args){
        LaptopManytoMany laptopManytoMany1 = new LaptopManytoMany();
        laptopManytoMany1.setLattopId(101);
        laptopManytoMany1.setLaptopBrand("Asus");
        laptopManytoMany1.setLaptopName("hello");

        LaptopManytoMany laptopManytoMany2 = new LaptopManytoMany();
        laptopManytoMany2.setLattopId(102);
        laptopManytoMany2.setLaptopBrand("HP");
        laptopManytoMany2.setLaptopName("world");

        StudentManytoMany studentManytoMany1 = new StudentManytoMany();
        studentManytoMany1.setSid(101);
        studentManytoMany1.setName("Rohit");
        studentManytoMany1.setLaptopManytoManyList(Arrays.asList(laptopManytoMany1,laptopManytoMany2));

        StudentManytoMany studentManytoMany2 = new StudentManytoMany();
        studentManytoMany2.setSid(102);
        studentManytoMany2.setName("Ayush");
        studentManytoMany2.setLaptopManytoManyList(Arrays.asList(laptopManytoMany1,laptopManytoMany2));

        laptopManytoMany1.setStudentManytoManyList(Arrays.asList(studentManytoMany1,studentManytoMany2));
        laptopManytoMany2.setStudentManytoManyList(Arrays.asList(studentManytoMany1,studentManytoMany2));

        SessionFactory sessionFactory = new Configuration().addAnnotatedClass(StudentManytoMany.class).addAnnotatedClass(LaptopManytoMany.class).configure("hibernate.cfg3.xml").buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(laptopManytoMany1);
        session.persist(laptopManytoMany2);
        session.persist(studentManytoMany1);
        session.persist(studentManytoMany2);


        transaction.commit();;

        session.close();
        sessionFactory.close();

    }
}
