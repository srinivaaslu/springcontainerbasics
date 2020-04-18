package com.nivas.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
@Aspect
public class TimeLoggingAspect {

    @Before("execution(* com.nivas.aop.SpringBeanTestForAOP.testAOP(..))")
    public void beforeLogging(JoinPoint joinPoint){
        System.out.println("Before entering the method"+joinPoint.getSignature());
    }

    @After("this(SpringBeanTestForAOP)")
    public void testAfterLogging(JoinPoint joinPoint){
        System.out.println("After coming out the method"+joinPoint.getSignature());
    }

    @Around("@annotation(LogAfter)")
    public Object logTotalTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = proceedingJoinPoint.proceed();
        long executionTime = System.currentTimeMillis()-start;
        System.out.println("Total time in executing "+proceedingJoinPoint.getSignature()+executionTime);
        return proceed;
    }

}
