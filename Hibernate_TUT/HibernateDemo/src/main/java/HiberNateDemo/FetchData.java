package HiberNateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
    public static void main(String [] args){
        Student st = null;
        SessionFactory sf = new Configuration().addAnnotatedClass(Student.class).configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sf.openSession(); // Here we don't need transaction because we are just fetching the data, transaction are required during making any changes in database.
        st = session.find(Student.class,1);
        System.out.println(st.getAge()+" - "+st.getName()+" - "+st.getSid());
        session.close();;
        sf.close();;
    }
}
