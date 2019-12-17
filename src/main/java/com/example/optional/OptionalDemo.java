package com.example.optional;

import org.apache.el.lang.FunctionMapperImpl;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.lang.reflect.Executable;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2019/12/13 10:10
 */
public class OptionalDemo {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(User.builder().name("你好").age(18).build());
        userList.add(User.builder().name("他好").age(19).build());

        List<User> userLists = new ArrayList<>();
        userLists.add(User.builder().name("你好").age(18).users(userList).build());

        User build = User.builder().name("你好").age(18).users(userList).build();

        Supplier<RuntimeException> supplier = RuntimeException::new;

        Function<RuntimeException,RuntimeException> suppli = RuntimeException::new;

        Function<? super User, ? extends String> mapper = User::getName;

//        List<User> users = userFuntion.create(build);

        Function<UserChild,String> sex = UserChild::getSex;

        UserFuntion<User,List<User>> userFuntion = User::getUsers;
//        build = null;
//        build.setName(null);

        String s1 = Optional.ofNullable(build).map(mapper).get();

//        String enen1 = Optional.ofNullable(build).map(bui2 -> bui2.getName()).orElse("enen1");

        System.out.println("s1");

        if(Optional.ofNullable(build).map(bui2 -> bui2.getName())
                .orElse(a()) == null){

            System.out.println("空了");

        }

        build = null;

        User user2 = Optional.of(build).orElseThrow(supplier);

        build = null;

        boolean empty = CollectionUtils.isEmpty(userLists);

//        Kotlin

        Optional<String> optional = Optional.of("bam");
        optional.isPresent();           // true
        optional.get();                 // "bam"
        optional.orElse("fallback");    // "bam"
        optional.ifPresent((s) -> System.out.println(s.charAt(0)));

        Optional<User> build1 = Optional.of(build);
        build1.ifPresent(user -> System.out.println(user.getName()));
        build1.ifPresent(user -> a());
        Optional<User> optionalUser = build1.filter(user -> StringUtils.endsWithIgnoreCase("a", user.getName()));
        User user1 = build1.filter(user -> StringUtils.endsWithIgnoreCase("a", user.getName())).get();

        Optional.of(build).isPresent();

        Optional.ofNullable(build).map(User::getName);

        Optional.ofNullable(build);

        String name = Optional.ofNullable(build).map(User::getName).orElse("kongle");

    }

    public static String a(){
        return null;
    }

    //具体构造函数的引用
    PersonFactory<Person> personFactory = Person::new;
    Person person = personFactory.create("Peter", "Parker");

}
class Person {
    String firstName;
    String lastName;
    Person() {}
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

//创建Person对象的对象工厂接口
interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}

@FunctionalInterface
interface UserFuntion<T,R>{

    R create(T t);

}

