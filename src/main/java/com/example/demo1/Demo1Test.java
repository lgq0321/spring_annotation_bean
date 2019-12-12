package com.example.demo1;

import com.example.annotation.MyAnnotation;
import com.example.annotation.MyTargetConstructor;
import com.example.annotation.MyTargetFleld;
import com.example.annotation.MyTargetType;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2019/12/10 18:14
 */
@MyTargetType(desc = "这是demo1类上面的注解描述")
public class Demo1Test {

    @MyTargetFleld("名字 蒼老師")
    private String name;

    @MyTargetFleld("年齡 36")
    int age;

    @MyTargetFleld("性別 女")
    public String sex;

    @MyAnnotation.MyTargetMethod
    public void sayHello(@MyAnnotation.MyTargetParam String name){
        System.out.println("Demo1Test Hello!");
    }

    @MyAnnotation.MyTargetMethod
    public void sayHello(){
        System.out.println("Demo1Test Hello!");
    }

    @MyTargetConstructor(desc = "带有一个参数的构造方法")
    public Demo1Test(@MyAnnotation.MyTargetParam String name) {
        this.name = name;
    }

//    @MyTargetConstructor
//    public Demo1Test() {
//    }

    @MyTargetConstructor
    private Demo1Test() {
    }

}
