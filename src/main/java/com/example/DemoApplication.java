package com.example;

import com.example.annotation.MyAnnotation;
import com.example.annotation.MyTargetConstructor;
import com.example.annotation.MyTargetFleld;
import com.example.demo1.Demo1Test;
import com.example.annotation.MyTargetType;
import com.example.demo5.EnableDefineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

@EnableDefineService
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
        Demo1Test bean = applicationContext.getBean(Demo1Test.class);
        System.out.println("------ 获取类属性上面的注解 ------");
        //获取private 属性
        Field name = bean.getClass().getDeclaredField("name");
        String annotation = name.getAnnotation(MyTargetFleld.class).value();
        System.out.println(annotation);
        //获取无显式修饰符 属性
        Field age = bean.getClass().getDeclaredField("age");
        annotation = age.getAnnotation(MyTargetFleld.class).value();
        System.out.println(annotation);
        //获取public 属性
        Field sex = bean.getClass().getField("sex");
        annotation = sex.getAnnotation(MyTargetFleld.class).value();
        System.out.println(annotation);

        System.out.println("------ 获取类上面的注解 ------");
        //另一种方式
        MyTargetType myTargetType = Demo1Test.class.getAnnotation(MyTargetType.class);

        //从上下文bean获取
        MyTargetType annotation1 = bean.getClass().getAnnotation(MyTargetType.class);

        System.out.println("默认注解："+myTargetType.name() + "手动写的描述："+ myTargetType.desc());

        System.out.println("默认注解："+annotation1.name() + "手动写的描述："+ annotation1.desc());

        System.out.println("------ 获取类方法上的注解 ------");
        Method sayHello1 = bean.getClass().getMethod("sayHello");
        MyAnnotation.MyTargetMethod annotation2 = sayHello1.getAnnotation(MyAnnotation.MyTargetMethod.class);
        System.out.println(Arrays.toString(annotation2.desc()));

        System.out.println("------ 获取类方法的参数注解 ------");
        Method sayHello = bean.getClass().getMethod("sayHello",String.class);
        Annotation[][] annotations = sayHello.getParameterAnnotations();
        for (Annotation[] annotations1: annotations) {
            for (Annotation annotati: annotations1) {
                if (annotati instanceof MyAnnotation.MyTargetParam) {
                    MyAnnotation.MyTargetParam param = (MyAnnotation.MyTargetParam) annotati;
                    System.out.println(param.desc());
                }
            }
        }

        Method sayHello2 = bean.getClass().getMethod("sayHello");
//        sayHello2.get

        System.out.println("------ 获取类的构造方法注解 ------");
        Constructor<? extends Demo1Test> constructor1 = bean.getClass().getConstructor(String.class);
        MyTargetConstructor annotation3 = constructor1.getAnnotation(MyTargetConstructor.class);

//        Constructor<? extends Demo1Test> constructor1 = bean.getClass().getConstructor(String.class);
//        MyTargetConstructor annotation3 = constructor1.getAnnotation(MyTargetConstructor.class);
        System.out.println(annotation3.desc());

        Constructor<? extends Demo1Test> declaredConstructor = bean.getClass().getDeclaredConstructor(String.class);

        Constructor<? extends Demo1Test> declaredConstructor1 = bean.getClass().getDeclaredConstructor();

        Constructor<?>[] constructor = bean.getClass().getDeclaredConstructors();

        System.out.println("------ 获取类的构造方法注解 ------");
//        System.out.println("------ 获取类的构造方法注解 ------");
//        Class<? extends Demo1Test> aClass = bean.getClass();
//
//        constructor = bean.getClass().getConstructor(new Class[] {String.class});
//        MyTargetConstructor annotation2 = constructor.getAnnotation(MyTargetConstructor.class);
//        System.out.println("默认构造方法注解："+annotation2.desc());

//        ApplicationContext context = new StaticWebApplicationContext();


    }

}
