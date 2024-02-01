package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach theCoach) {
        myCoach = theCoach;
    }

    @PostConstruct
    public void doMyStartStuff() {
        System.out.println("In doMyStartStuff(): " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
    }

    @GetMapping("/")
    public String hello() {
        return "hello yogesh!!";
    }

    @GetMapping("/dailyworkout")
    public String daily() {
        return myCoach.getDailyWorkout();
    }
}
