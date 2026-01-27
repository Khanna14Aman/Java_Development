package Microservices.Quiz.Model;

import lombok.Data;

@Data
public class QuizDto {
    private String category;
    private int noOfQuestions;
    private String title;
}
