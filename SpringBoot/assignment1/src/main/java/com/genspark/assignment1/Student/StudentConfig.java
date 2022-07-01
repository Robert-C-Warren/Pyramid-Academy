package com.genspark.assignment1.Student;

import com.genspark.assignment1.Repository.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepo repo) {
        return args -> {
            Student Robert = new Student(
                    1L,
                    "Robert Warren",
                    "robert.warren@genspark.net",
                    LocalDate.of(1995, Month.AUGUST, 6)
            );
            Student Alex = new Student(
                    "Alex",
                    "Alex@genspark.net",
                    LocalDate.of(1989, Month.MARCH, 27)
            );

            repo.saveAll(List.of(Robert, Alex));
        };
    }
}
