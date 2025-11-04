package edu.fra.uas.webapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.fra.uas.webapp.service.*;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import java.util.*;

@Component
public class GradeController {

   private List<Double>grades = new ArrayList<Double>();
    @Autowired 
    private GradingService gradingService;

    @PostConstruct
    public void dataInit(){
					grades.add(1.0);
					grades.add(1.7);
					grades.add(4.0);
					grades.add(5.0);
					grades.add(3.7);
                    System.out.println("Initialisiert");
    }

    @PreDestroy
    public void deleteData(){
        grades.clear();
        System.out.println("remove data");
    }

    public double putGrades(){
        return gradingService.calculateAvg(grades);
    }
}

