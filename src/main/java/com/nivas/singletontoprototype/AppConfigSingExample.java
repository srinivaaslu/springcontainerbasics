package com.nivas.singletontoprototype;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
//@Scope(
//        value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
//        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class AppConfigSingExample {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PrototypeBean prototypeBean(){
        return new PrototypeBean();
    }

    @Bean
    public SingletonBean singletonBean(){
        return new SingletonBean();
    }
}
