package me.ethan.springcoredemo.rest;

import me.ethan.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // lets framework know this class is a rest controller
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;
    private Coach anotherCoach;

    // CONSTRUCTOR INJECTION
    @Autowired
    public DemoController (@Qualifier("cricketCoach") Coach theCoach,
                           @Qualifier("cricketCoach") Coach theAnotherCoach){
        System.out.println("In constructor : " + getClass().getSimpleName()); // prints name of class when it is being read
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String checkScope(){
        return "Comparing Beans : myCoach == anotherCoach, " + (myCoach==anotherCoach);
    }
}
