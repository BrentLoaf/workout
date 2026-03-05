package org.brent.workout;

import org.brent.workout.workout.WorkoutRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkoutApplication {

	private static WorkoutRegistry registry = new WorkoutRegistry();

	public static void main(String[] args) {
		SpringApplication.run(WorkoutApplication.class, args);

		registry = new WorkoutRegistry();
	}

	public static WorkoutRegistry getWorkoutRegistry() {
		return registry;
	}
}
