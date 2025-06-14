package ua.mk.berkut.scores.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.mk.berkut.scores.entity.Teacher;
import ua.mk.berkut.scores.repository.TeacherRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class TeacherService {

    private final TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Teacher getTeacherById(Integer id) {
        return teacherRepository.findById(id).orElse(new Teacher());
    }

    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Teacher updateTeacher(Integer id, Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public void deleteTeacher(Integer id) {
        teacherRepository.deleteById(id);
    }

}
