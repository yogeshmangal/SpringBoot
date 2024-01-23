package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello World by Yogesh!!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k Steps";
    }

    @GetMapping("/fortune")
    public String getFortune() {
        return "Today is your lucky day.";
    }
}
