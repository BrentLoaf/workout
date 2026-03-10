package org.brent.workout.workout.exercise;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Intensity {

    @Positive
    private double amount;
    @NotNull
    private Type type;

    public enum Type {
        WEIGHT;
    }
}
