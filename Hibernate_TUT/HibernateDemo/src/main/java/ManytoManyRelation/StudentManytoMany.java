package ManytoManyRelation;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;


@Cacheable
@Entity
public class StudentManytoMany {
    @Id
    private int sid;
    private String name;
    @ManyToMany
    private List<LaptopManytoMany> laptopManytoManyList;

    public List<LaptopManytoMany> getLaptopManytoManyList() {
        return laptopManytoManyList;
    }

    public void setLaptopManytoManyList(List<LaptopManytoMany> laptopManytoManyList) {
        this.laptopManytoManyList = laptopManytoManyList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}
