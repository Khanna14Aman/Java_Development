package ManytoManyRelation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.sql.ResultSet;
import java.util.List;

public class HQLFetch {
    public static void main(String [] args){
        SessionFactory sessionFactory = new Configuration().addAnnotatedClass(StudentManytoMany.class).addAnnotatedClass(LaptopManytoMany.class).configure("hibernate.cfg3.xml").buildSessionFactory();

        Session session = sessionFactory.openSession();

        Query query = session.createQuery("from StudentManytoMany",StudentManytoMany.class);
        List<StudentManytoMany> listOfStudent = query.getResultList();
        for(StudentManytoMany studentManytoMany : listOfStudent){
            System.out.println(studentManytoMany.getSid()+" "+studentManytoMany.getName());
            for(LaptopManytoMany laptopManytoMany: studentManytoMany.getLaptopManytoManyList()){
                System.out.println(laptopManytoMany.getLattopId()+" "+laptopManytoMany.getLaptopBrand()+" "+laptopManytoMany.getLaptopName());
            }

        }
 // Here query will not get fired and data will come from session catche itself.
        listOfStudent = query.getResultList();
        for(StudentManytoMany studentManytoMany : listOfStudent){
            System.out.println(studentManytoMany.getSid()+" "+studentManytoMany.getName());
            for(LaptopManytoMany laptopManytoMany: studentManytoMany.getLaptopManytoManyList()){
                System.out.println(laptopManytoMany.getLattopId()+" "+laptopManytoMany.getLaptopBrand()+" "+laptopManytoMany.getLaptopName());
            }

        }

        int laptopID1 = 101;
        int laptopID2 = 102;
        query = session.createQuery("select laptopBrand, laptopName from LaptopManytoMany where lattopId = ?1 or lattopId = ?2");
        query.setParameter(1,laptopID1);
        query.setParameter(2,laptopID2);

        List<Object[]> objectList = query.getResultList();

        for(Object [] obj: objectList){
            System.out.println(obj[0] + " "+ obj[1]);
        }

        session.close();
        sessionFactory.close();
    }
}
