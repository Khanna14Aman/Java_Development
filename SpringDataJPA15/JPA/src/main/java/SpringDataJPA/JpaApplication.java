package SpringDataJPA;

import SpringDataJPA.model.Student;
import SpringDataJPA.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(JpaApplication.class, args);
//        Student s1 = applicationContext.getBean(Student.class);
//        Student s2 = applicationContext.getBean(Student.class);
//        Student s3 = applicationContext.getBean(Student.class);
//
//        s1.setRollNo(1);
//        s1.setName("Rohit");
//        s1.setMarks(10);
//
//        s2.setRollNo(2);
//        s2.setName("ayush");
//        s2.setMarks(2);
//
//        s3.setRollNo(5);
//        s3.setName("arnab");
//        s3.setMarks(1);

        StudentRepo studentRepo = applicationContext.getBean(StudentRepo.class);
//        studentRepo.save(s1);
//        studentRepo.save(s2);
//        studentRepo.save(s3);

        System.out.println(studentRepo.findAll());
        Optional<Student> student = studentRepo.findById(2);
        System.out.println(student);
	}
}
