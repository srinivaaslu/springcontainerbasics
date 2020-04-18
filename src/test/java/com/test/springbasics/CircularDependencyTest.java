package com.test.springbasics;

import com.nivas.circulardependency.CircularDependencyA;
import com.nivas.circulardependency.TestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
public class CircularDependencyTest {

    @Autowired
    private ApplicationContext context;
    @Test
    public void testCircularDependency(){
        CircularDependencyA circularDependencyA = context.getBean(CircularDependencyA.class);
        assertEquals("Hello CircularDependency",circularDependencyA.getMessageFromClassB());


    }
}
