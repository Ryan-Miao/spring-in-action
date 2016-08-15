package com.test.hello;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by rmiao on 8/15/2016.
 */
@Aspect
@Component
public class Monitor {

    private final Logger logger = LoggerFactory.getLogger(Monitor.class);

    @Pointcut("execution(* com.test.hello.MessagePrinter.printMessage())")
    public void  message(){}

    @Before(value = "message()")
    public void pre(){
        logger.info("before print.");
    }

    @After(value = "message()")
    public void after(){
        logger.info("after print.");
    }


}
