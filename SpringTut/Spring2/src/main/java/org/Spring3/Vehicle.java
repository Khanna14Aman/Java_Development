package org.Spring3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Vehicle {
    int cost;
    @Autowired
//    @Qualifier("pulsar")
    Bike bike;
    public Vehicle(){
        System.out.println("Vehicle is getting created");
    }



    public void run(){
        bike.run();
        System.out.println("Cost is : "+cost);
        System.out.println("My Vehicle");
    }
}
