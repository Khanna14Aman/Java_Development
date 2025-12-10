package HiberNateDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Student1to1 {
    @Id
    private int studentId;
    private String studentName;
    @OneToOne
    private LapTop1to1 lapTop1to1;

    public LapTop1to1 getLapTop1to1() {
        return lapTop1to1;
    }

    public void setLapTop1to1(LapTop1to1 lapTop1to1) {
        this.lapTop1to1 = lapTop1to1;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
