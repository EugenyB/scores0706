package ua.mk.berkut.scores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.mk.berkut.scores.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}