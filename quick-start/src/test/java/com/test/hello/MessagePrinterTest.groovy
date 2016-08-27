package com.test.hello

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

/**
 * Created by miaorf on 2016/8/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
class MessagePrinterTest {

    @Autowired
    MessagePrinter messagePinter;

    void setUp() {

    }

    @Test
    void testPrintMessage() {
        Assert.assertNotNull(messagePinter)
        messagePinter.printMessage();
    }
}
