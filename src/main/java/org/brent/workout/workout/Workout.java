package org.brent.workout.workout;

import lombok.Data;
import org.brent.workout.exercise.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class Workout {

    private UUID id = UUID.randomUUID();
    private String name;
    private List<Exercise> exercises = new ArrayList<>();

}
