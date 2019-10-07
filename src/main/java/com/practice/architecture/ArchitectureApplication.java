package com.practice.architecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com.practice")
public class ArchitectureApplication {



	public static void main(String[] args) {
		SpringApplication.run(ArchitectureApplication.class, args);
	}


}
