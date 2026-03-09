package org.brent.workout.workout.exercise;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public class Exercise {

    private String name;
    private Unit unit;
    private List<Set> sets = new ArrayList<>();

}
