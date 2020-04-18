package com.nivas.beanfactorypostprocesserexample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanFactoryPostProcessorExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(MyBFPPConfig.class);
        MyBean myBean = configApplicationContext.getBean(MyBean.class);
        myBean.doSomething();
    }
}
