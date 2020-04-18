package com.nivas.springprofilesexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdConfig {
    @Bean
    User user() {
        return new User(100, "Prod User");
    }
}
