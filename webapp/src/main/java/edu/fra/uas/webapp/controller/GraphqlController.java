package edu.fra.uas.webapp.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import edu.fra.uas.webapp.service.GradingService;

@Controller
@SchemaMapping()
public class GraphqlController {
        private static final Logger log = LoggerFactory.getLogger(GraphqlController.class);
        @Autowired
        private GradingService gradeService;


        @QueryMapping(name = "grades")
        public java.util.List<Double> getGrades() {
            log.debug("GraphQL Query: grades");
            return gradeService.getGrades();
        }

        @QueryMapping(name="gradebyId")
        public Double getGradeById(@Argument int id) {
            log.debug("GraphQL Query: gradebyId with id={}", id);
            java.util.List<Double> grades = gradeService.getGrades();
            if (id < 0 || id >= grades.size()) {
                return null;
            }
            return grades.get(id);
        }

        @QueryMapping(name="averageGrade")
        public Double getAverageGrade() {
            log.debug("GraphQL Query: averageGrade");
            return gradeService.calculateAvgerage();
        }

        @MutationMapping(name="addGrade")
        public Double addGrade(@Argument double value) {
            log.debug("GraphQL Mutation: addGrade with value={}", value);
            gradeService.addGrade(value);
            return value;
        }

        @MutationMapping(name="clearGrades")
        public boolean clearGrades() {
            log.debug("GraphQL Mutation: clearGrades");
            gradeService.clearData();
            return true;
        }

}
