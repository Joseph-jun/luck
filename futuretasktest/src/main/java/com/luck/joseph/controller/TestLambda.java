package com.luck.joseph.controller;

import java.util.Arrays;
import java.util.List;

/**
 * @author : Joseph.Tan
 * @Description: Everything is well!
 * @date : 2021/3/9 20:22
 */
public class TestLambda {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c","d");
        list.forEach(f->{
                        System.out.print(f+" >>>> ");
                        System.out.println("I hope you will be happy!");
        });
    }
}
