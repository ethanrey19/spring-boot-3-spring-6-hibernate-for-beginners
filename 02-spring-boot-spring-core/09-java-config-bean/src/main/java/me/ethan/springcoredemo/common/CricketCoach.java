package me.ethan.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component // makes the class as a spring bean, makes it available for dependency injection.
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!";
    }
}
