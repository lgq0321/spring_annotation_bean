package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2019/12/10 18:12
 */
@Component
public class DemoTest {
    public void sayHello(){

        System.out.println("DemoTest Hello!");
    }

    public static void main(String[] args) {

        Random rnd = new Random();
        BigInteger bi;
        for (int i = 2; i <= 7; i++) {

            bi = BigInteger.probablePrime(i, rnd);

            System.out.println("--- "+bi+" ---");
        }


    }
}
