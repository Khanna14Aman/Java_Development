package CacheTut;

import ManytoManyRelation.LaptopManytoMany;
import ManytoManyRelation.StudentManytoMany;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CacheL2Tut {
    public static void main(String [] args){
        SessionFactory sessionFactory = new Configuration().addAnnotatedClass(StudentManytoMany.class).addAnnotatedClass(LaptopManytoMany.class).configure("hibernate.cfg3.xml").buildSessionFactory();

        Session session = sessionFactory.openSession();

        StudentManytoMany studentManytoMany = session.find(StudentManytoMany.class,101);
        System.out.println(studentManytoMany.getName());

        session.close();

        Session session1 = sessionFactory.openSession();

        StudentManytoMany studentManytoMany1 = session1.find(StudentManytoMany.class,101);
        System.out.println(studentManytoMany1.getName());

        sessionFactory.close();
//    Added these dependencies to pom.xml file and @cacheble annotation to class whose data we are fetching.
//                <dependency>
//            <groupId>jakarta.xml.bind</groupId>
//            <artifactId>jakarta.xml.bind-api</artifactId>
//            <version>4.0.2</version>
//        </dependency>
//
//        <dependency>
//            <groupId>org.glassfish.jaxb</groupId>
//            <artifactId>jaxb-runtime</artifactId>
//            <version>4.0.5</version>
//        </dependency>
//
//        <dependency>
//            <groupId>org.glassfish.jaxb</groupId>
//            <artifactId>jaxb-core</artifactId>
//            <version>4.0.5</version>
//        </dependency>
    }
}
