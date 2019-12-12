package com.example.demo5;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2019/12/12 13:25
 */
public class Demo6Registrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        Class demo6Class = Demo6.class;
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(demo6Class);
        String demo6BeanName = StringUtils.uncapitalize(demo6Class.getSimpleName());
        registry.registerBeanDefinition(demo6BeanName,rootBeanDefinition);
    }
}
