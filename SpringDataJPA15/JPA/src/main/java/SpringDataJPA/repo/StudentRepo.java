package SpringDataJPA.repo;

import SpringDataJPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
    public List<Student> findByName(String name);
    public List<Student> findByMarks(int marks);
    public List<Student> findByMarksGreaterThan(int marks);
    public List<Student> findByMarksGreaterThanEqual(int marks);
    public List<Student> findByMarksBetween(int marks1, int marks2);
}