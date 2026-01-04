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
//        Student s4 = applicationContext.getBean(Student.class);
//        Student s5 = applicationContext.getBean(Student.class);
//
//        s1.setRollNo(1);
//        s1.setName("Rohit");
//        s1.setMarks(10);
//
//        s2.setRollNo(2);
//        s2.setName("ayush");
//        s2.setMarks(20);
//
//        s3.setRollNo(5);
//        s3.setName("arnab");
//        s3.setMarks(1);

//        s4.setRollNo(10);
//        s4.setName("ayush");
//        s4.setMarks(20);
//
//        s5.setRollNo(10);
//        s5.setName("hello");
//        s5.setMarks(20);


        StudentRepo studentRepo = applicationContext.getBean(StudentRepo.class);
//        studentRepo.save(s1);
//        studentRepo.save(s2);
//        studentRepo.save(s3);

        System.out.println(studentRepo.findAll());
        Optional<Student> student = studentRepo.findById(2);
        System.out.println(student);

        System.out.println(studentRepo.findByName("Rohit"));
        System.out.println(studentRepo.findByMarks(10));
        System.out.println(studentRepo.findByMarksGreaterThan(1));
        System.out.println(studentRepo.findByMarksGreaterThanEqual(1));
        System.out.println(studentRepo.findByMarksBetween(1,10));


//        studentRepo.save(s2);
//        studentRepo.save(s4);
//        studentRepo.delete(s5);

	}
}