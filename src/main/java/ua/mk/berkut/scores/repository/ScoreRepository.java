package ua.mk.berkut.scores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.mk.berkut.scores.entity.Score;
import ua.mk.berkut.scores.entity.Subject;

import java.util.List;

public interface ScoreRepository extends JpaRepository<Score, Integer> {
    List<Score> findByScoreContainingIgnoreCase(String name);
}