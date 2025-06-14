package ua.mk.berkut.scores.dto;

import java.io.Serializable;

/**
 * DTO for {@link ua.mk.berkut.scores.entity.Subject}
 */
public record SubjectDto(Integer id, String name, String description, Integer length) implements Serializable {
}