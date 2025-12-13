package OnetoManyRelation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Laptop1toMany {
    @Id
    private int lattopId;
    private String laptopBrand;
    private String laptopName;


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
}
