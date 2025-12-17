package org.Spring2;

public class Student {
    private Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void compile(){
        computer.compile();
    }
}
