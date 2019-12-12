package com.example.annotation;

import org.springframework.util.Assert;

import java.lang.annotation.*;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2019/12/11 11:33
 */
@Documented
@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyTargetFleld {
    String value();
}
