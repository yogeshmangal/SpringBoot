package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/coach")
    public String getCoachName() {
        return coachName;
    }

    @GetMapping("/team")
    public String getTeamName() {
        return teamName;
    }
}
