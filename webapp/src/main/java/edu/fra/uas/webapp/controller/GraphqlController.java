package edu.fra.uas.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import edu.fra.uas.webapp.service.GradingService;
import java.util.List;

@Controller
public class GraphqlController {

    private static final Logger log = LoggerFactory.getLogger(GraphqlController.class);

    @Autowired
    private GradingService gradingService;

    @QueryMapping(name="noten")
    public List<Double> getGrades() {
        log.debug("getGrades() is called");
        return gradingService.getGrades();
    }

    @QueryMapping(name="avg")
    public Double getAverage () {
        log.debug("getAverage() is called");
        return gradingService.calculateAvgerage();
    }

    @QueryMapping(name="gradeByIndex")
    public Double getGradeByIndex(@Argument int index){
        log.debug("getGradeByIndex() is called with index={}", index);
        if (gradingService.getGrades().size() > index && index >= 0){
            return gradingService.getGrades().get(index);
        }
        return null;
    }

    @MutationMapping(name="addGrade")
    public boolean addGrade(@Argument Double grade){
        log.debug("addGrade() is called with grade={}", grade);
        gradingService.addGrade(grade);
        if (gradingService.getGrades().contains(grade)){
            return true;
        }else return false;
    }

    @MutationMapping(name="deleteGrade")
    public Boolean deleteGrade(@Argument int index){
        log.debug("delete Grade at position={}", index);
        if (gradingService.getGrades().size() > index && index >= 0){
            gradingService.getGrades().remove(index);
            return true;
        }
        return false;
    }

    @MutationMapping
    public List <Double> updateGrades(@Argument int index, @Argument Double grade){
        log.debug("update Grade at position={}", index);
        if (gradingService.getGrades().size() > index && index >= 0){
            gradingService.getGrades().set(index, grade);
        }
        return gradingService.getGrades();
    }

}
