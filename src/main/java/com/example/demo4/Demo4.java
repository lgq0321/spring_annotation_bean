package com.example.demo4;

import com.example.demo1.Demo1Test;
import com.lgq.cn.Demo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2019/12/12 10:28
 */
public class Demo4 {
    @Autowired
    Demo demo;
    @Autowired
    Demo1Test demo1Test;
    public void sayHello(){
        demo1Test.sayHello();
        demo.sayHello();
        System.out.println("say hello demo4");
    }
}
