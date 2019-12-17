package com.example.reflect;

import com.example.optional.User;
import lombok.extern.log4j.Log4j2;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2019/12/14 16:20
 */
@Log4j2
public class demo6 {
    public static void main(String[] args) {

        User user = new User();
        user.setName("name");
        user.setAge(18);
        List<String> properties = new ArrayList<>();
        properties.add("age");

        for (String s : properties) {
            if("".equals(s)){
                user.setAge(null);
            }
        }




        for(String name:properties){
            try {
                Field f = user.getClass().getDeclaredField(name);
                f.setAccessible(true);

                f.set(user,0);

            } catch (Exception e) {
                log.error("exception="+e);
            }
        }
    }
}
