package com.test.spring.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Component 默认在spring应用上下文中注册一个bean，bean的id默认为类名首字母小写。
 * Created by miaorf on 2016/8/23.
 */
@Component
//@Component("lonelyHeartsClub")  // 自定义bean的id
//@Named("lonelyHeartsClub")  //使用java依赖注入规范Java Dependency Injection所提供的@Named注解来为bean设置id。
public class SgtPeppers implements CompactDisc {

    private static final Logger LOGGER = LoggerFactory.getLogger(SgtPeppers.class);

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String article = "The Beatles";

    @Override
    public void play() {
        LOGGER.info("Playing {} by {}", title, article);
    }
}
