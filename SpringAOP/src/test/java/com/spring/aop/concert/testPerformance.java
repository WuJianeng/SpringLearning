package com.spring.aop.concert;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = com.spring.aop.concert.ConcertConfig.class)
public class testPerformance {

    @Autowired
    private Performance performance;

    @Autowired
    private Audience audience;

    @Test
    public void testPerform(){
        Assert.assertNotNull(performance);
        performance.perform();
    }
}
