package com.example.sample_maven_service.controller;

import com.example.sample_maven_service.service.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(required = false) String name) {
        return greetingService.greet(name);
    }

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return greetingService.addNumbers(a, b);
    }
}
