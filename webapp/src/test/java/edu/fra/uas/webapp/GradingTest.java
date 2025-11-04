package edu.fra.uas.webapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import edu.fra.uas.webapp.controller.GradeController;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

import java.util.*;

@SpringBootTest
public class GradingTest {

    @Autowired
    private GradeController gradeController;

    //@Test
    //void emptyInput(){
      //  assertThat(gradeController.putGrades(List.of())).isEqualTo(0.0);
   // }

    //@Test
   // void precision(){
     //   assertThat(gradeController.putGrades(List.of(3.0,3.0,3.0))).isCloseTo(3.0, within(1e-9));
    //}

}
