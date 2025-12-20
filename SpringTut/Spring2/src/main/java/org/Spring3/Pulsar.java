package org.Spring3;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Primary
public class Pulsar implements Bike{
    public Pulsar(){
        System.out.println("Pulsar is getting created");
    }
    public void run(){
        System.out.println("Pulsar is running");
    }
}