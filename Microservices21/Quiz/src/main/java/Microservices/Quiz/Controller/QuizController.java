package Microservices.Quiz.Controller;

import Microservices.Quiz.Model.QuestionWrapper;
import Microservices.Quiz.Model.Quiz;
import Microservices.Quiz.Model.QuizResult;
import Microservices.Quiz.Model.Response;
import Microservices.Quiz.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {
    @Autowired
    private QuizService quizService;

    @PostMapping("/create")
    public ResponseEntity<Quiz> createQuiz(@RequestParam String category, @RequestParam int noOfQuestions, @RequestParam String title){
        return quizService.createQuiz(category,noOfQuestions,title);
    }

    @GetMapping("/getQuiz/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable int id){
        return quizService.getQuizQuestions(id);
    }

    @PostMapping("/submit/{id}")
    public ResponseEntity<QuizResult> submitQuiz(@PathVariable int id, @RequestBody List<Response> responseList){
        return quizService.submitQuiz(id,responseList);
    }

}
