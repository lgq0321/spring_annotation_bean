package com.example.optional;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2019/12/13 10:21
 */
@Data
@Builder
public class User {
    private String name;
    private Integer age;
    private List<User> users;

    public User(String name) {
        this.name=name;
    }

    public User(String name, int age, List<User> users) {
        this.name = name;
        this.age = age;
        this.users = users;
    }

    public User() {

    }
}
