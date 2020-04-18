package com.nivas.singletontoprototype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.springframework.util.Assert.isTrue;

public class TestSingletonExample {
    public static void main(String []args){
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(AppConfigSingExample.class);
        SingletonBean singletonBean = configApplicationContext.getBean(SingletonBean.class);
        PrototypeBean prototypeBean = singletonBean.getPrototypeBean();
        SingletonBean singletonBeanSecondTime = configApplicationContext.getBean(SingletonBean.class);
        PrototypeBean prototypeBeanSecond = singletonBeanSecondTime.getPrototypeBean();
        isTrue(!prototypeBean.equals(prototypeBeanSecond),"Each time new instance of prototype is returned");
        System.out.println(prototypeBean.equals(prototypeBeanSecond));

    }
}
