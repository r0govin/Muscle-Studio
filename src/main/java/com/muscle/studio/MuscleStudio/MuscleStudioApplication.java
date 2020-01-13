package com.muscle.studio.MuscleStudio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MuscleStudioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuscleStudioApplication.class, args);
	}

}
