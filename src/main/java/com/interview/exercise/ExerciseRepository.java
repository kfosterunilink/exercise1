package com.interview.exercise;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<ExerciseEntity, Long> {
    ExerciseEntity findBySecondaryId(Long secondaryId);
}
