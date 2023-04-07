package me.ethan.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // lets framework know that this is a rest controller
public class FunRestController {

    // inject properties for: coach.name and team.name

    @Value("${coach.name}") // injects value from the app.prop file and sets it to the String
    private String coachName;

    @Value("${team.name}")
    private String teamName; // injects value from the app.prop file and sets it to the String

    // expose new endpoint for "teamInfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: " + coachName + ", Team name: " + teamName;
    }

    // expose "/" endpoint that returns "Hello World"

    @GetMapping("/")
    public String sayHello(){
        return "Hello, World!";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "run a 5k!";
    }

    // expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day!";
    }
}
