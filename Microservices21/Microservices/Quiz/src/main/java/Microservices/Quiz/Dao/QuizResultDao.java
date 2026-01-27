package Microservices.Quiz.Dao;

import Microservices.Quiz.Model.QuizResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizResultDao extends JpaRepository<QuizResult, Integer> {
}
