package org.brent.workout.controllers;

import jakarta.validation.Valid;
import org.brent.workout.workout.Workout;
import org.brent.workout.services.WorkoutService;
import org.springframework.web.bind.annotation.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/workouts")
public class WorkoutController {

    private final WorkoutService service;

    public WorkoutController(WorkoutService service) {
        this.service = service;
    }

    @GetMapping(path = "/{day}")
    public List<Workout> getWorkouts(@PathVariable DayOfWeek day) {
        return service.getWorkouts(day);
    }

    @GetMapping(path = "/day")
    public String getDay() {
        return LocalDate.now().getDayOfWeek().toString();
    }

    @PostMapping(path = "/{day}")
    public void addWorkout(@PathVariable DayOfWeek day, @Valid @RequestBody Workout workout) {
        service.addWorkout(day, workout);
    }

    @DeleteMapping(path = "/{day}/{id}")
    public boolean deleteWorkout(@PathVariable DayOfWeek day, @PathVariable UUID id) {
        return service.deleteWorkout(day, id);
    }

    @PostMapping(path = "/days")
    public String[] getDays() {
        return Arrays.stream(DayOfWeek.values())
                .map(DayOfWeek::name)
                .toArray(String[]::new);
    }

    @PutMapping(path = "/{day}/{id}")
    public void updateWorkout(@PathVariable DayOfWeek day, @PathVariable UUID id, @Valid @RequestBody Workout workout) {
        service.updateWorkout(day, id, workout);
    }
}
