package org.brent.workout.workout.exercise;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public class Exercise {

    @NotBlank
    private String name;
    @NotNull
    private Unit unit;
    @Size(min = 1)
    private List<Set> sets = new ArrayList<>();

}
