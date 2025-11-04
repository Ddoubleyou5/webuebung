package edu.fra.uas.webapp.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

import edu.fra.uas.webapp.service.*;


import java.util.*;

@Controller
public class GradeController {
    private final Logger log = LoggerFactory.getLogger(GradeController.class);
    @Autowired 
    private GradingService gradingService;
    
    public double calculateAvg(){
        return gradingService.calculateAvgerage();
    }

    @RequestMapping(value={"/list"},method = RequestMethod.GET)
    public String listGrades(Model model){
        log.debug("list() is called");
        model.addAttribute("grades", gradingService.getGrades());
        return "notenView.html";
    }

    @RequestMapping(value="/", method=RequestMethod.GET)
    @ResponseBody
    public String getHelloWorld() {
        return "<h1>Willkommen zur Notenberechnung</h1>";
    }
}

