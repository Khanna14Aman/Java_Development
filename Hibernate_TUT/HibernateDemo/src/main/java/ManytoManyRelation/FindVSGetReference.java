package ManytoManyRelation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FindVSGetReference {
    public static void main(String [] args){
        SessionFactory sessionFactory = new Configuration().addAnnotatedClass(LaptopManytoMany.class).addAnnotatedClass(StudentManytoMany.class).configure("hibernate.cfg3.xml").buildSessionFactory();

        Session session = sessionFactory.openSession();

//        StudentManytoMany studentManytoMany = session.find(StudentManytoMany.class, 101);
//        System.out.println(studentManytoMany.getSid()+" "+studentManytoMany.getName());

          StudentManytoMany studentManytoMany = session.getReference(StudentManytoMany.class,101);
//          System.out.println(studentManytoMany.getSid()+" "+studentManytoMany.getName());
    }
}
