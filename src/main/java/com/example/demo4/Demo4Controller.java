package com.example.demo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2019/12/12 11:10
 */
@RestController
public class Demo4Controller {
    @Autowired
    Demo4 demo4;
    @RequestMapping("index")
    public void index(){
        demo4.sayHello();
    }
}
