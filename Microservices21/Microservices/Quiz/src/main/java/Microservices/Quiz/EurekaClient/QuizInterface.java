package Microservices.Quiz.EurekaClient;

import Microservices.Quiz.Model.QuestionWrapper;
import Microservices.Quiz.Model.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

// This annotation specifies which service we want to connect to
// The name must match exactly with the service registered in Eureka
@FeignClient("PROJECT")
public interface QuizInterface {

    // Declares the generate API from Question Service
    // The path and parameters must match the actual endpoint in Question Service
    @GetMapping("question/generate")
    public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String categoryName, @RequestParam Integer numQuestions);

    // Declares the getQuestions API from Question Service
    @PostMapping("question/getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds);

    // Declares the getScore API from Question Service
    @PostMapping("question/getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses);
}
