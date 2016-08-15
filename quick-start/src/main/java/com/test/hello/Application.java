package com.test.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rmiao on 8/15/2016.
 */
@Configuration
@ComponentScan
public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    @Bean
    MessageService mockMessageService(){
        return () -> "Hello World!";
    }

    public static void main(String[] args){
        logger.debug("start");
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
        logger.debug("end");
    }
}
