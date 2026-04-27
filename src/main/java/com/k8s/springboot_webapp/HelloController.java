package com.k8s.springboot_webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello World from Spring Boot and Kubernetes!";
    }

    @GetMapping("/db")
    public String db() {
        return "Spring Boot connected to MySQL!";
    }
}
