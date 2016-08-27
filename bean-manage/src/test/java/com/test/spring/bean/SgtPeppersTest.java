package com.test.spring.bean;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by miaorf on 2016/8/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class SgtPeppersTest {

    @Autowired
    private CompactDisc compactDisc;

    void setUp() {

    }

    @Test
    public void testPlay() {
        Assert.assertNotNull(compactDisc);
        compactDisc.play();
    }
}
