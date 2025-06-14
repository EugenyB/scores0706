package ua.mk.berkut.scores.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.mk.berkut.scores.entity.Score;
import ua.mk.berkut.scores.service.ScoreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/scores")
class ScoreController {

    private final ScoreService scoreService;

    @GetMapping
    public List<Score> getAllScores() {
        return scoreService.getAllScores();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Score> getScoreById(@PathVariable Integer id) {
        return scoreService.getScoreById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Score createScore(@RequestBody Score score) {
        return scoreService.createScore(score);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Score> updateScore(@PathVariable Integer id, @RequestBody Score score) {
        return scoreService.getScoreById(id)
                .map(s -> ResponseEntity.ok(scoreService.updateScore(score)))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteScore(@PathVariable Integer id) {
        return scoreService.getScoreById(id)
                .map(s -> {
                    scoreService.deleteScore(id);
                    return ResponseEntity.ok().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
