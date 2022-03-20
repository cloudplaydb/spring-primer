package com.spring.primer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPrimerApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to spring primer. ");
        SpringApplication.run(SpringPrimerApplication.class, args);
    }

}
