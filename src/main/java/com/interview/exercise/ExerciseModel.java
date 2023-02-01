package com.interview.exercise;

import com.fasterxml.jackson.annotation.JsonInclude;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@JsonInclude(NON_NULL)
public class ExerciseModel {
    private Long id;
    private Long secondaryId;

    public ExerciseModel(Long id, Long secondaryId) {
        this.id = id;
        this.secondaryId = secondaryId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
