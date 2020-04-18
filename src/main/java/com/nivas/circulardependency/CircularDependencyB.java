package com.nivas.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularDependencyB {
    private CircularDependencyA circularDependencyA;
    private String message="Hello CircularDependency";
//    @Autowired
//    public CircularDependencyB(CircularDependencyA circularDependencya) {
//        this.circularDependencyA = circularDependencya;
//    }

    public void setCircularDependencyA(CircularDependencyA circularDependencyA) {
        this.circularDependencyA = circularDependencyA;
    }

    public String getMessage(){
        return message;
    }
}
