package com.test.spring.bean.config.p1;

import com.test.spring.bean.config.p2.Bean3;
import com.test.spring.bean.config.p2.BeanConfig2;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * 两个不同的扫描配置类放到一起，相当于同一个spring context
 * Created by miaorf on 2016/8/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BeanConfig1.class, BeanConfig2.class})
public class Bean1Test {

    @Autowired
    Bean1 bean1;

    @Autowired
    Bean3 bean3;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void bean1FiledShouldNotBeNull() throws Exception{
        assertNotNull(bean1);
        assertNotNull(bean1.getBean2());
    }

    @Test
    public void bean1FiledBean3ShouldNotBeNull() throws Exception{
        assertNotNull(bean1);
        assertNotNull(bean1.getBean3());
    }

    @Test
    public void bean3FiledBean4ShouldNotBeNull() throws Exception{
        assertNotNull(bean3);
        assertNotNull(bean3.getBean4());
    }

    @Test
    public void bean3FiledBean1ShouldNotBeNull() throws Exception{
        assertNotNull(bean3);
        assertNotNull(bean3.getBean1());
    }

}