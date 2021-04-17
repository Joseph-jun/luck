package com.luck.joseph.controller;

/**
 * @author : Joseph.Tan
 * @Description:TODO
 * @date : 2021/3/9 8:53
 */
public class TestStack {

    int work() {
        int x = 5;
        int y = 4;
        int z = (x + y) * 10;
        return z;
    }

    public static void main(String[] args) {
        TestStack testStack = new TestStack();
        testStack.work();

        // java -cp .\sa-jdj.jar sun.jvm.hotspot.HSDB
        // java -cp .\sa-jdj.jar sun.jvm.hotspot.HSDB
        // java -cp .\sa-jdj.jar sun.jvm.hotspot.HSDB
        System.out.println("program run finish! 很好。努力！");
        Thread a =  new Thread();

        Runnable r = ()-> {
            System.out.println("do something!");
        };
        System.out.println();

        Runnable b = new Runnable() {
            @Override
            public void run() {
                System.out.println("do something after!");
            }
        };

        Runnable d = ()->{
            System.out.println("abc");
            System.out.println("do other things!");
            System.out.println("do other things!");
        };

 /*       try {
            // a.sleep(111111111);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
