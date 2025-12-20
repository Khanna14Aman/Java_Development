package org.Spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String [] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Vehicle vehicle = applicationContext.getBean(Vehicle.class);
        vehicle.run();
    }
}
