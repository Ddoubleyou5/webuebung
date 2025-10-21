package edu.fra.uas.webapp;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.*;

import edu.fra.uas.webapp.controller.GradeController;

@SpringBootApplication
public class WebappApplication {

	@Autowired
	private GradeController gradeController;

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}

	@Bean
	CommandLineRunner init(){
		CommandLineRunner cRunner = new CommandLineRunner() {
			@Override
			public void run(String... args)throws Exception{
				List<Double>grades = new ArrayList<Double>();
					grades.add(1.0);
					grades.add(1.7);
					grades.add(4.0);
					grades.add(5.0);
					grades.add(3.7);

					double result = gradeController.putGrades(grades);
					System.out.printf("Durchschnittsnote ist: %.2f%n", result);
			}
		};
		return cRunner;
	}

}
