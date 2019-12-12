package com.example.annotation;

import java.lang.annotation.*;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2019/12/11 12:02
 */
@Documented
@Target(ElementType.CONSTRUCTOR)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTargetConstructor {
    String desc() default "默认的构造方法";
}
