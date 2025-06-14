package ua.mk.berkut.scores.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import ua.mk.berkut.scores.repository.SubjectRepository;
import ua.mk.berkut.scores.entity.Subject;


import java.util.List;

@Service
@AllArgsConstructor
public class SubjectService {

    private final SubjectRepository subjectRepository;

    public Subject createSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    public Subject getSubjectById(Integer id) {
        return subjectRepository.findById(id).orElse(new Subject());
    }

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    public Subject updateSubject(Integer id, Subject updatedSubject) {
        Subject existingSubject = getSubjectById(id);
        existingSubject.setName(updatedSubject.getName());
        existingSubject.setDescription(updatedSubject.getDescription());
        existingSubject.setLength(updatedSubject.getLength());
        existingSubject.setTeachers(updatedSubject.getTeachers());
        return subjectRepository.save(existingSubject);
    }

    public void deleteSubject(Integer id) {
//        if (!subjectRepository.existsById(id)) {
//            throw new EntityNotFoundException("Subject not found with id: " + id);
//        }
        subjectRepository.deleteById(id);
    }


}
