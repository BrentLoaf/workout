package org.brent.workout.workout;

import org.brent.workout.WorkoutApplication;
import org.springframework.web.bind.annotation.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/workouts")
public class WorkoutController {

    @GetMapping(path = "/{day}")
    public List<Workout> getWorkouts(@PathVariable DayOfWeek day) {
        return WorkoutApplication.getWorkoutRegistry().getWorkouts(day);
    }

    @GetMapping(path = "/day")
    public String getDay() {
        return LocalDate.now().getDayOfWeek().toString();
    }

    @PostMapping(path = "/{day}")
    public void addWorkout(@PathVariable DayOfWeek day, @RequestBody Workout workout) {
        WorkoutApplication.getWorkoutRegistry().addWorkout(day, workout);
    }

    @DeleteMapping(path = "/{day}/{id}")
    public boolean deleteWorkout(@PathVariable DayOfWeek day, @PathVariable UUID id) {
        return WorkoutApplication.getWorkoutRegistry().deleteWorkout(day, id);
    }

    @PostMapping(path = "/days")
    public String[] getDays() {
        return Arrays.stream(DayOfWeek.values())
                .map(DayOfWeek::name)
                .toArray(String[]::new);
    }

    @PutMapping(path = "/{day}/{id}")
    public void updateWorkout(@PathVariable DayOfWeek day, @PathVariable UUID id, @RequestBody Workout workout) {
        WorkoutApplication.getWorkoutRegistry().updateWorkout(day, id, workout);
    }
}
