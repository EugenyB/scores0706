package ua.mk.berkut.scores.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.mk.berkut.scores.entity.Score;
import ua.mk.berkut.scores.entity.Subject;
import ua.mk.berkut.scores.repository.ScoreRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ScoreService {

    private final ScoreRepository scoreRepository;

    public Score createScore(Score score) {
        return scoreRepository.save(score);
    }

    public List<Score> getAllScores() {
        return scoreRepository.findAll();
    }

    public Optional<Score> getScoreById(Integer id) {
        return scoreRepository.findById(id);
    }

    public Score updateScore(Score score) {
        return scoreRepository.save(score);
    }

    public void deleteScore(Integer id) {
        scoreRepository.deleteById(id);
    }

}
