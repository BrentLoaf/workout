package org.brent.workout.workout;

import org.brent.workout.WorkoutApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/workouts")
public class WorkoutController {

    @GetMapping(path="/{day}")
    public List<Workout> getWorkouts(@PathVariable Day day) {
        return WorkoutApplication.getWorkoutRegistry().getWorkouts(day);
    }

    @PostMapping("/{day}")
    public void addWorkout(@PathVariable Day day, @RequestBody Workout workout) {
        WorkoutApplication.getWorkoutRegistry().addWorkout(day, workout);
    }
}
