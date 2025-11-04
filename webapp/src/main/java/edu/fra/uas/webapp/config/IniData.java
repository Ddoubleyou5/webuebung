package edu.fra.uas.webapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.fra.uas.webapp.service.GradingService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.slf4j.Logger;

@Component
public class IniData {

    private final Logger log = org.slf4j.LoggerFactory.getLogger(IniData.class);

    @Autowired
    GradingService gradingService;

    @PostConstruct
    public void init(){
        log.debug("Init Data has started");
            gradingService.addGrade(1.0);
            gradingService.addGrade(1.7);
            gradingService.addGrade(4.0);
            gradingService.addGrade(5.0);
            gradingService.addGrade(3.7);
    }

    @PreDestroy
    public void deleteData(){
        gradingService.clearData();
        log.debug("removed Data");
    }

}
