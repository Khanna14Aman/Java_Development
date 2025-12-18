package org.Spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop desktop = applicationContext.getBean("desktop1",Desktop.class);
        desktop.show();
//        Desktop desktop1 = applicationContext.getBean(Desktop.class);
//        desktop1.show();
    }
}
