package com.example.demo2;

import com.example.demo3.Demo3Test;
import com.example.demo4.Demo4;
import org.springframework.context.annotation.Import;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2019/12/10 18:16
 */
@Import(Demo4.class)
public class Demo2Test {
    public void sayHello(){
        System.out.println("Demo2Test Hello!");
    }
}
