package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach1;
    private Coach myCoach2;

    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach C1, @Qualifier("baseballCoach") Coach C2) {
        myCoach1 = C1;
        myCoach2 = C2;
    }

    @GetMapping("/")
    public String hello() {
        return "hello yogesh!!";
    }

    @GetMapping("/check")
    public boolean check() {
        return myCoach1 == myCoach2;
    }
    @GetMapping("/dailyworkout")
    public String daily() {
        return myCoach1.getDailyWorkout();
    }
}
