package HiberNateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embeddable {
    public static void main(String [] args){
        Address address = new Address();
        address.setBuildingNumber(10);
        address.setCity("Prayagraj");
        address.setRoadName("Kalyani Devi");

        Student student = new Student();
        student.setSid(201);
        student.setAge(10);
        student.setName("Naman");
        student.setAddress(address);

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(student);
        transaction.commit();

        Student res = session.find(Student.class,20);
        System.out.println(res.getSid()+" - "+res.getName()+" - "+res.getAge()+" - "+res.getAddress().getBuildingNumber()+" - "+res.getAddress().getRoadName()+" - "+res.getAddress().getCity());
        session.close();
        sessionFactory.close();
    }
}
