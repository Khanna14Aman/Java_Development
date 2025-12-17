package org.Spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String [] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student student = (Student) applicationContext.getBean("student2");
        student.compile();
        TestingLazy testingLazy = (TestingLazy) applicationContext.getBean("testingLazy");
        TestingLazy testingLazy1 = (TestingLazy) applicationContext.getBean("testingLazy");// testingLazy class is marked as lazyinit in bean, so object will get creted only when it is required but it will have a scope singleton only means only 1 object will get created.
    }

}
