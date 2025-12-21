package SpringBoot1.Lession2.repository;

import SpringBoot1.Lession2.model.Bike;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public class BikeRepository {
    public BikeRepository() {
        System.out.println("BikeRepository is created");
    }
    public String save(Bike bike){
        System.out.println("Bike saved");
        return "Bike Saved in Database";
    }
}
