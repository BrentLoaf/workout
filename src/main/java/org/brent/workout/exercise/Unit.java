package org.brent.workout.exercise;

import jakarta.annotation.Nullable;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Unit {
    REPETITIONS("Reps"),
    SECONDS("Seconds"),
    MINUTES("Minutes");

    private final String name;

    public static @Nullable Unit getUnitFromName(String string) {
        for (Unit unit : Unit.values()) {
            if (unit.getName().equalsIgnoreCase(string)) continue;
            return unit;
        }

        return null;
    }
}
