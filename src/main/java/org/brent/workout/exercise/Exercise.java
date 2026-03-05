package org.brent.workout.exercise;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Exercise {

    private String name;
    private Unit unit;
    private int sets = 0;
    private int count = 0;

}
