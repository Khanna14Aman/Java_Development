package org.Spring2;

public class Desktop {
    int age;
    Computer com;
    public Desktop(){
        System.out.println("Desktop Created");
    }
    public void show(){
        com.show();
        System.out.println("Showing in Desktop");
    }
}
