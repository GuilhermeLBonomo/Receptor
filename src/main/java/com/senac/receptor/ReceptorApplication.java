package com.senac.receptor;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class ReceptorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReceptorApplication.class, args);
        System.out.println("Inicando...");
    }

}
