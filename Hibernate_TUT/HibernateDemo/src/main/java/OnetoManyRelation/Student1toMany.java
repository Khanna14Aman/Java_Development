package OnetoManyRelation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Student1toMany {
    @Id
    private int sid;
    private String name;
    @OneToMany // This line is reflecting that one student can have multiple laptop records. But as we have a primary key at student Id so, it cannot create multiple line of student in single table so it will create a saparate table with two columns laptop ID and Student ID.
    // As multiple laptop can belongs to single student and every laptop have unique id and in laptop table can have same records of same student so we can store student id in laptop table.
    private List<Laptop1toMany> laptop1toManyList;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Laptop1toMany> getLaptop1toManyList() {
        return laptop1toManyList;
    }

    public void setLaptop1toManyList(List<Laptop1toMany> laptop1toManyList) {
        this.laptop1toManyList = laptop1toManyList;
    }
}
