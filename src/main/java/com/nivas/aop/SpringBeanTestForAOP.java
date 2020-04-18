package com.nivas.aop;

public class SpringBeanTestForAOP {
    public void testAOP(){
        System.out.println("In the method testAOP");
    }

    @LogAfter
    public void testAnnotationLogging(){
        System.out.println("In the annotation method logging");
    }
}
