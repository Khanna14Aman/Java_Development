package SpringJDBC.SpringJDBC1.services;

import SpringJDBC.SpringJDBC1.model.Student;
import SpringJDBC.SpringJDBC1.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class StudentService {
    private StudentRepo studentRepo;

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void addStudent(Student student){
        studentRepo.save(student);
    }

    public List<Student> getStudentList(){
        return studentRepo.findAll();
    }
}
