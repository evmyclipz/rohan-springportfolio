package com.nighthawk.spring_portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nighthawk.spring_portfolio.mvc.jwt.Databasemanager;

// @SpringBootApplication annotation is key to building web applications with Java https://spring.io/projects/spring-boot
@SpringBootApplication
public class Main {

    // Starts a spring application as a stand-alone application from the main method
    public static void main(String[] args) {
        Databasemanager.initializeDatabase();
        SpringApplication.run(Main.class, args);
    }

}