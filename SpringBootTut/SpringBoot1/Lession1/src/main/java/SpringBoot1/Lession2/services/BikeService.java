package SpringBoot1.Lession2.services;

import SpringBoot1.Lession2.model.Bike;
import SpringBoot1.Lession2.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class BikeService {
    @Autowired
    private BikeRepository bikeRepository;
    public BikeService(){
        System.out.println("Bike Service is getting created");
    }
    public void addBike(Bike bike){
        System.out.println(bikeRepository.save(bike));
    }
    public boolean isServiced(Bike bike){
        return true;
    }
}
