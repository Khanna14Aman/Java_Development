package org.Spring1;

public class Student {
    private int age;
    private Laptop laptop;
    public Student(){
        System.out.println("Student Created");
    }
    public void coding(){
        laptop.show();
        System.out.println("Codding");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
