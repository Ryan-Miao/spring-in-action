package com.test.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

/**
 * Created by rmiao on 8/15/2016.
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class Application {

    @Bean
    MessageService mockMessageService(){
        return () -> "Hello World!";
    }

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
