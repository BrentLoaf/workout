package org.brent.workout.workout.exercise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping(path = "/exercises")
public class ExerciseController {

    @GetMapping(path = "/units")
    public String[] getUnits() {
        return Arrays.stream(Unit.values())
                .map(Unit::name)
                .toArray(String[]::new);
    }

    @GetMapping(path = "/to-name/{unit}")
    public String getUnitName(@PathVariable Unit unit) {
        return unit.getName();
    }

    @GetMapping(path = "/to-unit/{unitName}")
    public Unit getUnitFromName(@PathVariable String name) {
        return Unit.getUnitFromName(name);
    }
}
