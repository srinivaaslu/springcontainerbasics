package com.nivas.propertyplaceholder;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPropertySourceExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(PropertyPlaceHolderConfig.class);
        Student student =configApplicationContext.getBean(Student.class);
        System.out.println(student.getStudentName());
    }
}
