package ManytoManyRelation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class LaptopManytoMany {
    @Id
    private int lattopId;
    private String laptopBrand;
    private String laptopName;
    @ManyToMany(mappedBy = "laptopManytoManyList")
    private List<StudentManytoMany> studentManytoManyList;

    public int getLattopId() {
        return lattopId;
    }

    public void setLattopId(int lattopId) {
        this.lattopId = lattopId;
    }

    public String getLaptopBrand() {
        return laptopBrand;
    }

    public void setLaptopBrand(String laptopBrand) {
        this.laptopBrand = laptopBrand;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public List<StudentManytoMany> getStudentManytoManyList() {
        return studentManytoManyList;
    }

    public void setStudentManytoManyList(List<StudentManytoMany> studentManytoManyList) {
        this.studentManytoManyList = studentManytoManyList;
    }
}
