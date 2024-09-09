package com.agora_spring.agora_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.agora_spring.agora_spring.model")
public class AgoraSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgoraSpringApplication.class, args);
                System.out.println("Spring Boot Application Started");
	}

}
