package com.example.annotation;

import java.lang.annotation.*;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2019/12/11 16:34
 */
public class MyAnnotation {

    @Target(ElementType.METHOD)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MyTargetMethod{
        String[] desc() default {"这是自定义注解","这是定义在方法上注解"};
    }

    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.PARAMETER)
    public @interface MyTargetParam{
        String desc() default "这是自定义注解,这是定义在方法参数上注解";
    }

    @Target(ElementType.LOCAL_VARIABLE)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MyTargetLocalVariable{
        String desc() default "这是自定义注解，定义在局部变量上的注解";
    }

}
