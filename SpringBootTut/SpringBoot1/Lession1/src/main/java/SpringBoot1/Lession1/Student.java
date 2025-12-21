package SpringBoot1.Lession1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    @Value("25")
    private int age;
//    @Autowired
//    @Qualifier("desktop")
    private Computer com;
    public Student(){
        System.out.println("Student Created");
    }
    @Autowired
    public Student(Computer com){
        this.com = com;
    }
    public void show(){
        com.run();
        System.out.println("Show is running");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public Computer getCom() {
//        return com;
//    }
//    @Autowired
//    @Qualifier("desktop")
//    public void setCom(Computer com) {
//        this.com = com;
//    }
}
