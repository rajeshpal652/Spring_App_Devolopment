package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewHelloWorldApplication {

    public static void main(String[] args) {

        System.out.println("Hello From Bridgelabz");
        SpringApplication.run(NewHelloWorldApplication.class, args);
    }

}
