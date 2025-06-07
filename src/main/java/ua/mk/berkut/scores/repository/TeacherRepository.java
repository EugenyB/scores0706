package ua.mk.berkut.scores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.mk.berkut.scores.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}