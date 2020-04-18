package com.nivas.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CircularDependencyA {

    @Autowired
    private CircularDependencyB circularDependencyB;

//    @Autowired
//    //Using @Lazy will ensure it wont create circulate dependency
//    public CircularDependencyA(@Lazy CircularDependencyB circularDependencyB) {
//        this.circularDependencyB = circularDependencyB;
//    }


    //Another way to overcome Circular dependency by writing postconstuct
    @PostConstruct
    public void init(){
        circularDependencyB.setCircularDependencyA(this);
    }

    public String getMessageFromClassB(){
        return circularDependencyB.getMessage();
    }
}
