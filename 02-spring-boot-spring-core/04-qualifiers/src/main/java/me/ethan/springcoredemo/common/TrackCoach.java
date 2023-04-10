package me.ethan.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component // makes the class as a spring bean, makes it available for dependency injection.
public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Run a 5k";
    }
}
