package org.brent.workout.exercise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping(path="/exercises")
public class ExerciseController {

    @GetMapping(path="/units")
    public String[] getUnits() {
        return Arrays.stream(Unit.values())
                .map(Unit::name)
                .toArray(String[]::new);
    }
}
