package com.webstart.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.webstart.springboot.configuration.JpaConfiguration;


@Import(JpaConfiguration.class)
@SpringBootApplication //(scanBasePackages = {"com.webstart.springboot"})
// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringBootCRUDApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCRUDApp.class, args);
    }
}
