package com.test.spring.bean;

import org.springframework.stereotype.Component;

/**
 * Created by miaorf on 2016/8/24.
 */
public class DVDPlayer implements CompactDisc {
    @Override
    public void play() {
        System.out.println("dvd");
    }
}
