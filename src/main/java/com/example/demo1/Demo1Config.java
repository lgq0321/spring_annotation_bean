package com.example.demo1;

import com.example.demo2.Demo2Test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2019/12/10 18:14
 */
@Import(Demo2Test.class)
@Configuration
public class Demo1Config {
    @Bean
    public Demo1Test demo1Test(){
        return new Demo1Test("da");
    }

}
