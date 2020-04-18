package com.nivas.springprofilesexample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestProfileExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext();
        configApplicationContext.getEnvironment().setActiveProfiles("prod");
        configApplicationContext.scan("com.nivas.springprofilesexample");
        configApplicationContext.refresh();
        User user = configApplicationContext.getBean(User.class);
        System.out.println("User Name is ::"+user.getName());
    }
}
