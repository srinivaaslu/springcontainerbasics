package com.nivas.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StandAloneAOPRun {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext();
        configApplicationContext.register(AspectConfig.class);
        configApplicationContext.refresh();
        SpringBeanTestForAOP springBeanTestForAOP = configApplicationContext.getBean(SpringBeanTestForAOP.class);
//        springBeanTestForAOP.testAOP();
        springBeanTestForAOP.testAnnotationLogging();

    }
}
