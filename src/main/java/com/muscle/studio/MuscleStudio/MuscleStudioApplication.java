package com.muscle.studio.MuscleStudio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.muscle.studio"})
public class MuscleStudioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuscleStudioApplication.class, args);
	}

}
