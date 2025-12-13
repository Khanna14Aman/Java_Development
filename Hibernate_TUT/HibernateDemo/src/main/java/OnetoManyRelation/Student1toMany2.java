package OnetoManyRelation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Student1toMany2 {
    @Id
    private int sid;
    private String name;
    @OneToMany(mappedBy = "student1toMany2") // This is indicating that in Student table we don't need to create column of laptop It will be create by "student1toMany2" instance variable of Laptop Class
    private List<Laptop1toMany2> laptop1toManyList;

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

    public List<Laptop1toMany2> getLaptop1toManyList() {
        return laptop1toManyList;
    }

    public void setLaptop1toManyList(List<Laptop1toMany2> laptop1toManyList) {
        this.laptop1toManyList = laptop1toManyList;
    }
}
