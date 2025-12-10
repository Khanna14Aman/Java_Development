package HiberNateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateSchema {
    public static void main(String [] args){
        Alien obj = new Alien();
        obj.setSid(2343);
        obj.setAlienName("Jadu");
        obj.setAge(23);
        obj.setQty(12);
        SessionFactory sessionFactory = new Configuration().addAnnotatedClass(Alien.class).configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(obj);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
