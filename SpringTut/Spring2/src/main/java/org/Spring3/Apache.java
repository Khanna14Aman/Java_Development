package org.Spring3;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Apache implements Bike{
    public Apache(){
        System.out.println("Apache is getting cretaed");
    }
    public void run(){
        System.out.println("Apache is running");
    }
}
