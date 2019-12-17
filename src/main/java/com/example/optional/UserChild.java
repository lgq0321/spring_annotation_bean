package com.example.optional;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2019/12/13 16:18
 */

public class UserChild extends User {
    private String sex;

//    UserChild(String name, int age, List<User> users) {
//        super(name, age, users);
//    }

    public UserChild(String name, int age, List<User> users, String sex) {
        super(name, age, users);
        this.sex = sex;
    }

    public UserChild(String name) {
        super(name);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
