package HiberNateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OnetoOneRelationship {
    public static void main(String [] args){
        LapTop1to1 lapTop1to1 = new LapTop1to1();
        lapTop1to1.setLaptopId(2);
        lapTop1to1.setBrand("Asus");
        lapTop1to1.setLaptopName("boom");
        lapTop1to1.setPrice(1000);

        Student1to1 student1to1 = new Student1to1();
        student1to1.setStudentId(2);
        student1to1.setStudentName("Naman");
        student1to1.setLapTop1to1(lapTop1to1);

        SessionFactory sessionFactory = new Configuration().addAnnotatedClass(LapTop1to1.class).addAnnotatedClass(Student1to1.class).configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();


        session.persist(lapTop1to1);
        session.persist(student1to1);
        transaction.commit();;
        session.close();;
        sessionFactory.close();;
    }
}
