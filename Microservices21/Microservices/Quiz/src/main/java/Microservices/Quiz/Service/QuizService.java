package Microservices.Quiz.Service;

import Microservices.Quiz.Dao.QuizDao;
import Microservices.Quiz.Dao.QuizResultDao;
import Microservices.Quiz.EurekaClient.QuizInterface;
import Microservices.Quiz.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    private QuizDao quizDao;

    @Autowired
    QuizInterface quizInterface;

    @Autowired
    private QuizResultDao quizResultDao;

    public ResponseEntity<Quiz> createQuiz(String category, int noOfQuestions, String title) {
        try {
            List<Integer> questions = quizInterface.getQuestionsForQuiz(category,noOfQuestions).getBody();
            Quiz quiz = new Quiz();
            quiz.setTitle(title);
            quiz.setQuestionIds(questions);
            quizDao.save(quiz);
            return new ResponseEntity<>(quiz, HttpStatus.CREATED);
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new Quiz(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(int id) {
        try {
            Optional<Quiz> quiz = quizDao.findById(id);
            List<Integer> questionIds = quiz.get().getQuestionIds();
            List<QuestionWrapper> questionWrapperList = quizInterface.getQuestionsFromId(questionIds).getBody();
            return new ResponseEntity<>(questionWrapperList, HttpStatus.OK);
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<QuizResult> submitQuiz(int id, List<Response> responseList) {
        try {
            Optional<Quiz> quiz = quizDao.findById(id);
            if(quiz.isEmpty()){
                return new ResponseEntity<>(new QuizResult(),HttpStatus.BAD_REQUEST);
            }
            int quizScore = quizInterface.getScore(responseList).getBody();
            QuizResult quizResult = new QuizResult();
            quizResult.setQuizId(id);
            quizResult.setQuizResult(quizScore);
            quizResultDao.save(quizResult);
            return new ResponseEntity<>(quizResult, HttpStatus.OK);
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new QuizResult(), HttpStatus.BAD_REQUEST);
    }
}
