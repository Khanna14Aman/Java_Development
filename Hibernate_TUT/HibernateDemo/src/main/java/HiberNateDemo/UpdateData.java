package HiberNateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateData {
    public static void main(String [] args){
        Student s1 = new Student();
        s1.setSid(6);
        s1.setName("JustTestingwithouData");
        s1.setAge(6);

        SessionFactory sf = new Configuration().addAnnotatedClass(Student.class).configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        session.merge(s1);
        tr.commit();
        session.close();
        sf.close();
    }
}
