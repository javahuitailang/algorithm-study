package com.algorithm.offer.part1;

/**
 * @ClassName Singleton
 * @Description 单例模式--恶汉模式
 * @Author meimingzhi
 * @Date 2020/2/3 5:13 下午
 */
public class Singleton1 {
    private static final Singleton1 INSTANCE = new Singleton1();
    private Singleton1(){
    }
    public static Singleton1 getInstance(){
        return INSTANCE;
    }
}
