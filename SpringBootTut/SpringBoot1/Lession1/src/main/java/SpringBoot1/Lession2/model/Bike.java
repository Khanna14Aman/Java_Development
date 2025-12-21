package SpringBoot1.Lession2.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bike {
    public Bike(){
        System.out.println("Bike is created");
    }
    public void run(){
        System.out.println("Bike is running");
    }
}
