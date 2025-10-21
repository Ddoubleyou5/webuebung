package edu.fra.uas.webapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.fra.uas.webapp.service.*;
import java.util.*;

@Component
public class GradeController {
    @Autowired private GradingService gradingService;

    public double putGrades(List<Double>grades){
        return gradingService.calculateAvg(grades);
    }
}
