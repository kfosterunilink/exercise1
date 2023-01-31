package com.interview.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exercises")
public class ExerciseController {

    @Autowired
    private ExerciseService service;

    @GetMapping("/{id}")
    public ExerciseModel getExercise(@PathVariable Long id) {
        return service.findExercise(id);
    }
}