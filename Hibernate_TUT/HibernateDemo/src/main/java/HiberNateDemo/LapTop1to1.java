package HiberNateDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LapTop1to1 {
    @Id
    private int laptopId;
    private String brand;
    private int price;
    private String laptopName;

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }
}
