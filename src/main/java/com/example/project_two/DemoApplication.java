package com.example.project_two;

import com.example.project_two.JpaRepository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@ComponentScan(basePackages = {"com.example.project_two.JpaRepository", "com.example.project_two.controller", "com.example.project_two.service" })
//@Configuration
//@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("Start");
        SpringApplication.run(DemoApplication.class, args);
//        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//        UserRepository userRepository = context.getBean(UserRepository.class);
    }

}
