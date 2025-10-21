package com.example.demo.springboot.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication(scanBasePackages = "com.example.demo.springboot")
@EnableJpaRepositories(basePackages = "com.example.demo.springboot.Repository")
@EntityScan(basePackages = "com.example.demo.springboot.Model.Entity")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}
