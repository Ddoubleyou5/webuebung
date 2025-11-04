package edu.fra.uas.webapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.fra.uas.webapp.service.*;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import java.util.*;

@Component
public class GradeController {
    @Autowired 
    private GradingService gradingService;
    
    public double calculateAvg(){
        return gradingService.calculateAvgerage();
    }
}

