package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository)
    {
        return args -> {
       Student mariams = new Student(
                    "prisca",
                    "prisca@gmail.com",
                    LocalDate.of(2001, 1, 1)
            );

       Student Alexy = new Student(
                    "alexander",
                    "alexander@gmail.com",
                    LocalDate.of(2000, 12, 1)
            );

       repository.saveAll(List.of(mariams, Alexy));

        };

    }
}
