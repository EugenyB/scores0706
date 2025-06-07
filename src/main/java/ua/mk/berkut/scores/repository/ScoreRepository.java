package ua.mk.berkut.scores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.mk.berkut.scores.entity.Score;

public interface ScoreRepository extends JpaRepository<Score, Integer> {
}