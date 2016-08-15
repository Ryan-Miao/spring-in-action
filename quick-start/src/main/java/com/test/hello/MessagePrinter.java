package com.test.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by rmiao on 8/15/2016.
 */
@Component
public class MessagePrinter {

    final private MessageService service;

    @Autowired
    public MessagePrinter(MessageService service){
        this.service = service;
    }

    public void printMessage(){
        System.out.println(this.service.getMessage());
    }
}
