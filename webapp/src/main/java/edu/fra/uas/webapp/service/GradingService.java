package edu.fra.uas.webapp.service;

import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class GradingService {
    public double calculateAvg(List<Double>grades){
       if (grades.isEmpty() || grades == null) return 0.0;
       else {
           return grades.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
       } 
    }
}
