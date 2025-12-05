package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class App {

    private final Calculator calculator = new Calculator();

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello from Spring Boot on Kubernetes!";
    }

    @GetMapping("/add/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b) {
        return a + " + " + b + " = " + calculator.add(a, b);
    }

    @GetMapping("/multiply/{a}/{b}")
    public String multiply(@PathVariable int a, @PathVariable int b) {
        return a + " * " + b + " = " + calculator.multiply(a, b);
    }

    @GetMapping("/divide/{a}/{b}")
    public String divide(@PathVariable int a, @PathVariable int b) {
        try {
            return a + " / " + b + " = " + calculator.divide(a, b);
        } catch (IllegalArgumentException e) {
            return "Error: " + e.getMessage();
        }
    }
}
