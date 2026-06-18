package com.chandru.store;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome To Chandru Store";
    }
    @GetMapping("/health")
    public String health() {
        return "UP";
    }
    @GetMapping("/products")
    public List<String> products() {
        return List.of(
                "Laptop",
                "Keyboard",
                "Mouse",
                "Monitor"
        );
    }
}