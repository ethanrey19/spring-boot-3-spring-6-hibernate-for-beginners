package me.ethan.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // makes the class as a spring bean, makes it available for dependency injection.
@Primary // makes it so this is the primary implementation that spring will use when scanning for beans
public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Run a 5k";
    }
}
