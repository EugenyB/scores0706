package ua.mk.berkut.scores.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ua.mk.berkut.scores.entity.Teacher;
import ua.mk.berkut.scores.service.TeacherService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/teachers")
class TeacherController {
    private final TeacherService teacherService;

    @GetMapping
    public List<Teacher> findAll() {
        return teacherService.getAllTeachers();
    }

    @GetMapping("/{id}")
    public Teacher findById(@PathVariable Integer id) {
        return teacherService.getTeacherById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Teacher save(@RequestBody Teacher teacher) {
        return teacherService.saveTeacher(teacher);
    }

    @PutMapping("/{id}")
    public Teacher update(@PathVariable Integer id, @RequestBody Teacher teacher) {
        return teacherService.updateTeacher(id, teacher);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Integer id) {
        teacherService.deleteTeacher(id);
    }
}
