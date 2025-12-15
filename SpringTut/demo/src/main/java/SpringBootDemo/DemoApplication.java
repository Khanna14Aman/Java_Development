package SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {

//        Dependency_Injection_Demo dependencyInjectionDemo = new Dependency_Injection_Demo();
        // Creating Object Using Spring and this process is call dependency injection.
        // applicatoinContext is pointing to container from where we can get the object.
        ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
        Dependency_Injection_Demo dependencyInjectionDemo = applicationContext.getBean(Dependency_Injection_Demo.class);
        dependencyInjectionDemo.show();

    }
}
