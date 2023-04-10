package me.ethan.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component // makes the class as a spring bean, makes it available for dependency injection.
@Lazy // makes this bean not scanned until it is needed
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a 5k";
    }
}
