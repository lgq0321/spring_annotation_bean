package com.example.optional;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.ChoiceCallback;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2019/12/13 17:10
 */
public class UserOptional {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        UserFactory<User> userFactory = User::new;
        User user = userFactory.create("父类");
        System.out.println(user.getName());

        UserFactory<UserChild> childUserFactory = UserChild::new;
        UserChild userChild = childUserFactory.create("子类");
        System.out.println(userChild.getName());

        UserFactory<User> dwwq = User::new;

        FutureTask<Callback> futureTask = new FutureTask<>(new Callable<Callback>() {
            @Override
            public Callback call() throws Exception {

                return null;
            }
        });

        CallableImpl callable = new CallableImpl();

        Callback callback = futureTask.get();

        FutureTask<Callback> futureTask2 = new FutureTask<>(()->null);

        UserFactory<User> factory = new UserFactory<>() {
            @Override
            public User create(String name) {
                return null;
            }
        };

        UserFactory<User> factory2 = (name)-> User.builder().build();
        User user1 = factory2.create("最后的名字");
        System.out.println(user1.toString());


    }
}

class CallableImpl implements Callable<User>{
    @Override
    public User call() throws Exception {
        return User.builder().build();
    }
}

class TaskWithResult implements Callable<String> {
    private int id;
    public TaskWithResult(int id) {
        this.id=id;
    }

    @Override
    public String call() throws Exception {
        return "result of TaskWithResult "+id;
    }
}

@FunctionalInterface
interface UserFactory<T extends User>{
    T create(String name);
}

class UserFactoryImpl<T extends User> implements UserFactory{
    private User user;
    @Override
    public User create(String name) {
        user = User.builder().build();
        return user;
    }

    private User getUser(){
        return user;
    }
}