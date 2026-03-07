package org.brent.workout.workout;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Data
@RequiredArgsConstructor
public class WorkoutRegistry {

    private final HashMap<DayOfWeek, List<Workout>> workoutsByDay = new HashMap<>();

    public List<Workout> getWorkouts(DayOfWeek day) {
        return workoutsByDay.get(day);
    }

    public void addWorkout(DayOfWeek day, Workout workout) {
        List<Workout> currentWorkouts = workoutsByDay.containsKey(day) ?
                new ArrayList<>(workoutsByDay.get(day)) :
                new ArrayList<>();

        currentWorkouts.add(workout);
        workoutsByDay.put(day, currentWorkouts);
    }

    public boolean deleteWorkout(DayOfWeek day, UUID id) {
        if (!workoutsByDay.containsKey(day)) return false;
        List<Workout> currentWorkouts = new ArrayList<>(workoutsByDay.get(day));

        boolean isRemoved = currentWorkouts.removeIf(w -> w.getId().equals(id));
        workoutsByDay.put(day, currentWorkouts);
        return isRemoved;
    }

    public void updateWorkout(DayOfWeek day, UUID id, Workout workout) {
        if (!workoutsByDay.containsKey(day)) return;
        List<Workout> currentWorkouts = new ArrayList<>(workoutsByDay.get(day));

        currentWorkouts
                .stream().filter(w -> w.getId().equals(id))
                .forEach(w -> {
            w.setName(workout.getName());
            w.setExercises(workout.getExercises());
        });
        workoutsByDay.put(day, currentWorkouts);
    }
}
