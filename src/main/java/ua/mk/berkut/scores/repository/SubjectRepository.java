package ua.mk.berkut.scores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.mk.berkut.scores.entity.Subject;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {

    List<Subject> findByNameContainingIgnoreCase(String name);
}