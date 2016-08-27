package com.test.spring.bean;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by miaorf on 2016/8/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    CDPlayer cdPlayer;

    @Before
    public void setUp() throws Exception {

    }
    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cdPlayer);
    }

    @Test
    public void play() throws Exception {
        cdPlayer.play();
    }

}