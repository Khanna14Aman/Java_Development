package SpringJDBC.SpringJDBC1;

import SpringJDBC.SpringJDBC1.model.Student;
import SpringJDBC.SpringJDBC1.services.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbc1Application {

	public static void main(String[] args) {
	    ApplicationContext applicationContext = SpringApplication.run(SpringJdbc1Application.class, args);
        Student student = applicationContext.getBean(Student.class);
        student.setAge(12);
        student.setID(1);
        student.setName("Rohit");
        StudentService studentService = applicationContext.getBean(StudentService.class);
        studentService.addStudent(student);
        System.out.println(studentService.getStudentList());
        System.out.println(student);
	}
}
