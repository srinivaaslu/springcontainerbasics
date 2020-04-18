package com.nivas.singletontoprototype;


import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalTime;

public class SingletonBean {

    @Autowired
    private ObjectFactory<PrototypeBean> objectFactory;

    public SingletonBean(){
        System.out.println("initialized singleton");
    }
    public PrototypeBean getPrototypeBean(){
        System.out.printf("initialized singleton%s%n", LocalTime.now());
        return objectFactory.getObject();
    }
}
