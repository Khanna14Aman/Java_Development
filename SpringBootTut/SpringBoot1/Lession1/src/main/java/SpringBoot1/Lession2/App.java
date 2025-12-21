package SpringBoot1.Lession2;

import SpringBoot1.Lession2.model.Bike;
import SpringBoot1.Lession2.services.BikeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String [] args){
        ApplicationContext applicationContext = SpringApplication.run(App.class,args);
        Bike bike = applicationContext.getBean(Bike.class);
        BikeService bikeService = applicationContext.getBean(BikeService.class);
        System.out.println(bikeService.isServiced(bike));
        bikeService.addBike(bike);
    }
}
