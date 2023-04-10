package me.ethan.springcoredemo.common;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("In constructor: " +getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1,000 meters!";
    }
}
