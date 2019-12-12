package com.example.demo1;

import com.example.demo4.Demo4;
import com.lgq.cn.Demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2019/12/12 9:54
 */
@ComponentScan("com.example.demo4")
@SpringBootApplication
public class CoreTestApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CoreTestApplication.class, args);
        Demo4 demo4 = context.getBean(Demo4.class);
        Demo demoBean = context.getBean(Demo.class);
        demo4.sayHello();
        demoBean.sayHello();
    }
}
