package com.nivas.propertyplaceholder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class PropertyPlaceHolderConfig {
    @Value("${sample.studentName}")
    private String studentName;

    @Value("${sample.courseName")
    private String courseName;
    @Bean
    Student student(){
        return new Student(studentName,courseName);
    }

}
