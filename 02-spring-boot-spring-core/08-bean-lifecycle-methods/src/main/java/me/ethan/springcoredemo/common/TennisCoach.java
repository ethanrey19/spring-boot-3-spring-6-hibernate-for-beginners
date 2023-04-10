package me.ethan.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component // makes the class as a spring bean, makes it available for dependency injection.
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("In constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
