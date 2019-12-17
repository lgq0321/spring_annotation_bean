package com.example.demo5;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2019/12/12 13:08
 */
public class Demo5ImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        String name = Demo5.class.getName();
        Map<String, Object> attributes = annotationMetadata.getAnnotationAttributes(EnableDefineService.class.getName());
        return new String[]{Demo5.class.getName()};
    }
}
