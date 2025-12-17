package org.Spring2;

public class Laptop implements Computer{
    public Laptop(){
        System.out.println("Creating Laptop");
    }
    public void compile(){
        System.out.println("Compiling using Laptop");
    }
}
