package me.ethan.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component // makes the class as a spring bean, makes it available for dependency injection.
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("In constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minute batting practice";
    }
}
