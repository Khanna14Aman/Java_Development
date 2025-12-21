package SpringBoot1.Lession1;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class Laptop implements Computer{
    public Laptop(){
        System.out.println("Laptop is created");
    }
    public void run(){
        System.out.println("Laptop is running");
    }
}
