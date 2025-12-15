package SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dependency_Injection_Demo {
    @Autowired
    Injection injection;
    public void show(){
        injection.injection();
        System.out.println("This is dependency injection");
    }
}
