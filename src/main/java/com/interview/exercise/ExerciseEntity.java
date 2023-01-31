package com.interview.exercise;

import javax.persistence.*;

@Table (name = "Exercise")
@Entity
public class ExerciseEntity {

    @Id
    @Column(name = "ExerciseId")
    @GeneratedValue(generator = "ExerciseIdSeq")
    @SequenceGenerator(name = "ExerciseIdSeq", sequenceName = "ExerciseIdSeq", allocationSize = 1)
    private Long id;

    private Long secondaryId;

    public ExerciseEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSecondaryId() {
        return secondaryId;
    }

    public void setSecondaryId(Long secondaryId) {
        this.secondaryId = secondaryId;
    }
}