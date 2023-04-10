package me.ethan.springcoredemo.config;

import me.ethan.springcoredemo.common.Coach;
import me.ethan.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// custom config file for the different coaches
// take an existing third party class and expose it as a bean
@Configuration
public class SportConfig {

    // set custom id for injecting our bean
    @Bean("customId")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
