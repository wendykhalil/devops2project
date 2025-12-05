package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

        // Si tu veux garder tes calculs pour test rapide
        Calculator calc = new Calculator();
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("4 * 5 = " + calc.multiply(4, 5));
        System.out.println("10 / 2 = " + calc.divide(10, 2));
    }
}
