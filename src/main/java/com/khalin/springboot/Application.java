package com.khalin.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
//@EnableJpaAuditing  :: springBootApplication과 EnableJpaAuditing 분리
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
