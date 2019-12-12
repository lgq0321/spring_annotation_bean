package com.example.demo5;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2019/12/12 13:16
 */
@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Import({Demo5ImportSelector.class,Demo6Registrar.class})
public @interface EnableDefineService {

}
