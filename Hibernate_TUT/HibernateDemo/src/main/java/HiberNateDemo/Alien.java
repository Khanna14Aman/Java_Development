package HiberNateDemo;

import jakarta.persistence.*;

@Entity
@Table(name = "alien")
public class Alien {
    @Id
    private int sid;

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Column(name = "alienname")
    private String alienName;
    private int age;
    @Transient
    private int qty;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getAlienName() {
        return alienName;
    }

    public void setAlienName(String alienName) {
        this.alienName = alienName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
