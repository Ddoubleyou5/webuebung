package edu.fra.uas.webapp.service;

import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class GradingService {

    private List<Double>grades = new ArrayList<Double>();

    public double calculateAvgerage(){
       if (grades.isEmpty() || grades == null) return 0.0;
       else {
           return grades.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
       } 
    }

    public List<Double> getGrades(){
        return grades;
    }

    public void addGrade(double grade){
        if (grade != 0.0){
            grades.add(grade);
        }
    }

    public void clearData(){
        if (!grades.isEmpty()){
            grades.clear();
        }
    }
}
