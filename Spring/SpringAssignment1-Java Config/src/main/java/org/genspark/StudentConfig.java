package org.genspark;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean(initMethod = "setAllStudent")
    public Student getStudent() {
        return new Student();
    }

    @Bean(initMethod = "setAllAddress")
    public Address getAddress() {
        return new Address();
    }

    @Bean(initMethod = "setPhoneNumber")
    public Phone getPhone() {
        return new Phone();
    }
}
