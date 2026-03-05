package org.brent.workout.workout;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Data
@RequiredArgsConstructor
public class WorkoutRegistry {

    private final HashMap<Day, List<Workout>> workoutsByDay = new HashMap<>();

    public List<Workout> getWorkouts(Day day) {
        return workoutsByDay.get(day);
    }

    public void addWorkout(Day day, Workout workout) {
        List<Workout> currentWorkouts = workoutsByDay.containsKey(day) ?
                new ArrayList<>(workoutsByDay.get(day)) :
                new ArrayList<>();

        currentWorkouts.add(workout);
        workoutsByDay.put(day, currentWorkouts);
    }
}
