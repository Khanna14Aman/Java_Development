package org.Spring1;

import java.beans.ConstructorProperties;

public class Laptop {
    private String ram;
    private String processor;
    private int memory;
    @ConstructorProperties({"ram","processor", "memory"})
    public Laptop(String ram, String processor, int memory){
        this.ram = ram;
        this.memory = memory;
        this.processor = processor;
    }

    public Laptop(){
        System.out.println("Laptop Created");
    }
    public void show(){
        System.out.println(ram);
        System.out.println(memory);
        System.out.println(processor);
        System.out.println("This is laptop");
    }
}
