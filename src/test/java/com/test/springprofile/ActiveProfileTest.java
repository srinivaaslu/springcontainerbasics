package com.test.springprofile;

import com.nivas.springprofilesexample.TestConfig;
import com.nivas.springprofilesexample.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles({"test"})
public class ActiveProfileTest {

    @Autowired
    User user;

    @Test
    public void testSpringActiveProfile(){
        assertEquals("Test User",user.getName());
    }

}
