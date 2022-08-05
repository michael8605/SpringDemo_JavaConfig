package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConf {
    @Bean
    public Student student(){

        return new Student(9917059, "Thomas And", phone(), address());
    }

    @Bean
    public Address address(){

        return  new Address("New Haven", "CT", "USA", "06511");
    }

    @Bean
    public List<Phone> phone() {
        List<Phone> ph = new ArrayList<>();
        ph.add(new Phone("860-774-0262"));
        ph.add(new Phone("860-204-7142"));
        ph.add(new Phone("860-578-0045"));
        return ph;
    }
}
