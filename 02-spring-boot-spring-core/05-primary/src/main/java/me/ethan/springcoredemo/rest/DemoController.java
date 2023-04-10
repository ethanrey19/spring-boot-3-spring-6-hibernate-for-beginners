package me.ethan.springcoredemo.rest;

import me.ethan.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // lets framework know this class is a rest controller
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;

    // CONSTRUCTOR INJECTION
    @Autowired
    public DemoController (Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
