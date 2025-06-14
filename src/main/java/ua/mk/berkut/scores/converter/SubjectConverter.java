package ua.mk.berkut.scores.converter;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import ua.mk.berkut.scores.dto.SubjectDto;
import ua.mk.berkut.scores.entity.Subject;

import java.util.List;

@Component
@ApplicationScope
public class SubjectConverter {

    public SubjectDto convertToDto(Subject subject) {
        return new SubjectDto(subject.getId(), subject.getName(), subject.getDescription(), subject.getLength());
    }

    public Subject convertFromDto(SubjectDto subjectDto) {
        Subject subject = new Subject();
        subject.setId(subjectDto.id());
        subject.setName(subjectDto.name());
        subject.setDescription(subjectDto.description());
        subject.setLength(subjectDto.length());
        return subject;
    }

    public List<SubjectDto> convertToDto(List<Subject> subjects) {
        return subjects.stream().map(this::convertToDto).toList();
    }
}
