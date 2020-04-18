package com.nivas.beanfactorypostprocesserexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBFPPConfig {

    @Bean
    MyBeanImplementsBFPP myBean(){
        return new MyBeanImplementsBFPP();
    }

}
