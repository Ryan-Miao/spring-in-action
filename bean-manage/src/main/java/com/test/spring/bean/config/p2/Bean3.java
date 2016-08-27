package com.test.spring.bean.config.p2;

import com.test.spring.bean.config.p1.Bean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by miaorf on 2016/8/24.
 */
@Component
public class Bean3 {
    @Autowired
    private Bean4 bean4;
    @Autowired
    private Bean1 bean1;

    public Bean1 getBean1() {
        return bean1;
    }

    public Bean4 getBean4() {
        return bean4;
    }
}
