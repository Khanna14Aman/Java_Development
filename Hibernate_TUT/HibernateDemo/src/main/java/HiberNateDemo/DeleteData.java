package HiberNateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {
    public static void main(String [] args){
        SessionFactory sessionFactory = new Configuration().addAnnotatedClass(Student.class).configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Student st = session.find(Student.class,6);
        if(st!=null)session.remove(st);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
