package ua.mk.berkut.scores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.mk.berkut.scores.entity.Subject;
import ua.mk.berkut.scores.entity.Teacher;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    List<Teacher> findByNameContainingIgnoreCase(String name);
}