package SpringBoot1.Lession1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Desktop implements Computer{
    public Desktop(){
        System.out.println("Desktop is created");
    }
    public void run(){
        System.out.println("Desktop is running");
    }
}
