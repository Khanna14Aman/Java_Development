package SpringBoot1.Lession1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lession1Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Lession1Application.class, args);
        Student student = applicationContext.getBean(Student.class);
        student.show();
        System.out.println(student.getAge());
	}
}
