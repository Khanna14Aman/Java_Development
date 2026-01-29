package Microservices.Quiz.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {
    private int questionId;
    private String response;
}
