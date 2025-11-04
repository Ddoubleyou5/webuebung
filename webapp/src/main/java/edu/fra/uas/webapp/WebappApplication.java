package edu.fra.uas.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import edu.fra.uas.webapp.controller.GradeController;

@SpringBootApplication
public class WebappApplication {

    @Autowired
    private GradeController gradeController;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = 
            SpringApplication.run(WebappApplication.class, args);
        context.registerShutdownHook();
    }

    @Bean
    CommandLineRunner init(){
        return args -> {
            double result = gradeController.calculateAvg();
            System.out.printf("Durchschnittsnote ist: %.2f%n", result);
        };
    }
}

