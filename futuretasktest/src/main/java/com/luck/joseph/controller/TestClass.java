package com.luck.joseph.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author : Joseph.Tan
 * @Description:TODO
 * @date : 2021/3/10 14:06
 */
public class TestClass {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Class<?> aClass = Class.forName("com.luck.joseph.controller.Dog");

        Object obj = aClass.newInstance();

        Method[] aClassMethods = aClass.getMethods();

        for (Method method : aClassMethods) {
            method.invoke(obj,null);
        }

    }
}
