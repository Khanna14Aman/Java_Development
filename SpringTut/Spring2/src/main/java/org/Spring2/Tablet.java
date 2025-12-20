package org.Spring2;

public class Tablet implements Computer{
    public Tablet(){
        System.out.println("Creating Tablet Object");
    }
    @Override
    public void show() {
        System.out.println("Showing in Tablet");
    }
}
