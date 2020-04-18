package com.nivas.springprofilesexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration

public class TestConfig {
    @Bean
    @Profile("test")
    User user(){
        return new User(200,"Test User");
    }

    @Bean
    @Profile("prod")
    User userProd() {
        return new User(100, "Prod User");
    }
}
