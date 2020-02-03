package com.algorithm.offer.part1;

/**
 * @ClassName Singleton
 * @Description 单例模式
 * @Author meimingzhi
 * @Date 2020/2/3 5:13 下午
 */
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();
    private Singleton (){

    }
    public Singleton getInstance(){
        return INSTANCE;
    }
}
