package com.algorithm.offer.part1;

/**
 * @ClassName Test
 * @Description TODO
 * @Author meimingzhi
 * @Date 2020/2/11 4:36 下午
 */
public class Test {
    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        Singleton3 instance3 = Singleton3.instance;
        Singleton4 instance4 = Singleton4.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);
        System.out.println(instance4);
    }
}
