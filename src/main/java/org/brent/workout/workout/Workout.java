package org.brent.workout.workout;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.brent.workout.exercise.Exercise;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public class Workout {

    private String name;
    private List<Exercise> exercises = new ArrayList<>();

}
