package org.brent.workout.workout.exercise;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Set {

    @Min(1)
    @Positive
    private int count = 0;
}
