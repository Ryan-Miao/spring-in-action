package com.test.spring.bean;

import org.springframework.context.annotation.ComponentScan;

/**
 * @ComponentScan 默认会以配置类所在的包为基础包（base package）
 * 来扫描组件。
 * Created by miaorf on 2016/8/23.
 */
//@ComponentScan
//@ComponentScan("com.test.spring.bean")//自定义base package
//@ComponentScan(basePackages = "com.test.spring.bean")//自定义base package
//@ComponentScan(basePackages = {"com.test.spring.bean", "other package"})//自定义base package
@ComponentScan(basePackageClasses = {CDPlayerConfig.class})
public class CDPlayerConfig {
}
