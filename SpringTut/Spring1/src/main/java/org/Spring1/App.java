package org.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
        Student student1 = (Student) applicationContext.getBean("student");
        student1.coding();
        System.out.println(student1.getAge());
        Student student2 = (Student) applicationContext.getBean("student");
        student2.coding();
        System.out.println(student2.getAge());
    }
}
