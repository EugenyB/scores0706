package ua.mk.berkut.scores.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.mk.berkut.scores.entity.Subject;
import ua.mk.berkut.scores.repository.StudentRepository;
import ua.mk.berkut.scores.entity.Student;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getALLStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).orElse(new Student());
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
}
