package com.test.spring.bean.config.p1;

import com.test.spring.bean.config.p2.Bean3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by miaorf on 2016/8/24.
 */
@Component
public class Bean1 {
    @Autowired
    private Bean2 bean2;

    @Autowired
    private Bean3 bean3;

    public Bean2 getBean2() {
        return bean2;
    }

    public Bean3 getBean3() {
        return bean3;
    }
}
