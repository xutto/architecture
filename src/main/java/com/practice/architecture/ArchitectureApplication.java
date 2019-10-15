package com.practice.architecture;

import com.practice.annotation.Logeable;
import java.util.Set;
import org.reflections.Reflections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com.practice")
public class ArchitectureApplication {


    public static void main(String[] args) {
        SpringApplication.run(ArchitectureApplication.class, args);
    }

    @Bean
    public void setLogToService() {
        Reflections reflections = new Reflections("com.practice.controller");

        Set<Class<?>> allClasses = reflections.getTypesAnnotatedWith(Logeable.class);

        allClasses.forEach(aClass -> System.out.println(aClass.getName()));
    }

}
