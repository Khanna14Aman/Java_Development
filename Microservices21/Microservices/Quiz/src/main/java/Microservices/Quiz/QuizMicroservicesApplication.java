package Microservices.Quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class QuizMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizMicroservicesApplication.class, args);
	}

}
