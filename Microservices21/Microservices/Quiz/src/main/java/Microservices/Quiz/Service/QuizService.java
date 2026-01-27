package Microservices.Quiz.Service;

import Microservices.Quiz.Dao.QuizDao;
import Microservices.Quiz.Dao.QuizResultDao;
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
    private QuizResultDao quizResultDao;

    public ResponseEntity<Quiz> createQuiz(String category, int noOfQuestions, String title) {
        try {
            Quiz quiz = new Quiz();
//            quiz.setTitle(title);
//            quiz.setQuestionList(questionDao.findRandomQuestionsByCategory(category, noOfQuestions));
//            quizDao.save(quiz);
            return new ResponseEntity<>(quiz, HttpStatus.CREATED);
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new Quiz(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(int id) {
        try {
//            Optional<Quiz> quiz = quizDao.findById(id);
//            List<Question> questionList = quiz.get().getQuestionList();
            List<QuestionWrapper> questionWrapperList = new ArrayList<>();
//            for (Question q : questionList) {
//                questionWrapperList.add(new QuestionWrapper(q.getId(), q.getQuestionTitle(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4()));
//            }
            return new ResponseEntity<>(questionWrapperList, HttpStatus.OK);
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<QuizResult> submitQuiz(int id, List<Response> responseList) {
        try {
//            List<Question> questionList = quizDao.findById(id).get().getQuestionList();
//            int rightAns = 0, index = 0;
//            for (Response response : responseList) {
//                if (response.getResponse().equals(questionList.get(index).getRightAnswer())) {
//                    rightAns++;
//                }
//                index++;
//            }
            QuizResult quizResult = new QuizResult();
//            quizResult.setQuizResult(rightAns);
//            quizResult.setQuizId(id);
//            quizResultDao.save(quizResult);
            return new ResponseEntity<>(quizResult, HttpStatus.OK);
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new QuizResult(), HttpStatus.BAD_REQUEST);
    }
}
