package edu.fra.uas.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import edu.fra.uas.webapp.service.GradingService;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/restnoten")
public class restController {

private final Logger log = org.slf4j.LoggerFactory.getLogger(RestController.class);
@Autowired
private GradingService gradingService;

@GetMapping(value="/noten", produces = MediaType.APPLICATION_JSON_VALUE)
@ResponseBody
public ResponseEntity<List<Double>> list() {
    log.debug("list() is called");
    List<Double> grades = gradingService.getGrades();
    if (grades.isEmpty()) {
        return ResponseEntity.noContent().build();
    }
    return new ResponseEntity<>(grades, HttpStatus.OK);
}

@GetMapping(value="/avg", produces = MediaType.APPLICATION_JSON_VALUE)
@ResponseBody
public ResponseEntity<Double> average() {
    log.debug("average() is called");
    Double average = gradingService.calculateAvgerage();
    if (average == 0.0) {
        return ResponseEntity.noContent().build();
    }
    return new ResponseEntity<>(average, HttpStatus.OK);
}

@PostMapping("/add")
@ResponseBody
public ResponseEntity<Void> add(Double grade) {
    log.debug("add() is called with grade={}", grade);
    if (grade == null) {
        return ResponseEntity.badRequest().build();
    }
    gradingService.addGrade(grade);
    return new ResponseEntity<>(HttpStatus.CREATED);
}

@DeleteMapping("/clear")
@ResponseBody
public ResponseEntity<Void> clearAll() {
    log.debug("clearAll() is called");
    gradingService.clearData();
    return new ResponseEntity<>(HttpStatus.OK);
}

}
