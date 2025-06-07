package ua.mk.berkut.scores.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.mk.berkut.scores.repository.StudentRepository;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

}
