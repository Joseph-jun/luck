package com.luck.joseph.controller;

/**
 * @author : Joseph.Tan
 * @Description:VM Args: -XX:+PrintGC
 * @date : 2021/3/10 8:19
 */
public class Isalive {

    public Object instance = null;
    private byte[] bigSize = new byte[10 * 1024 * 1024];

    public static void main(String[] args) {
        Isalive objectA = new Isalive();
        Isalive objectB = new Isalive();

        // 互相引用
        objectA.instance = objectB;
        objectB.instance = objectA;

        // 切断根可达
        objectA = null;
        objectB = null;

        // 强制垃圾回收
        System.gc();

    }

}
