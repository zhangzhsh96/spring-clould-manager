package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class App {
    public static void main(String[] args) {
        System.out.println("===g");
        SpringApplication.run(App.class, args);
    }
}
