package com.interview.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseRepository repository;

    public ExerciseModel findExercise(Long secondaryId) {
        ExerciseEntity exercise = repository.findBySecondaryId(secondaryId);
        return new ExerciseModel(exercise.getId(), exercise.getSecondaryId());
    }
}