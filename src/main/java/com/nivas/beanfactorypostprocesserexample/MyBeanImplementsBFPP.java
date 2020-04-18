package com.nivas.beanfactorypostprocesserexample;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class MyBeanImplementsBFPP implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
        genericBeanDefinition.setBeanClass(MyBean.class);
        genericBeanDefinition.getPropertyValues().add("myProp","HelloFromBFPP");
        ((DefaultListableBeanFactory)configurableListableBeanFactory).registerBeanDefinition("myBean",genericBeanDefinition);

    }
}
