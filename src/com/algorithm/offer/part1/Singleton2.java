package com.algorithm.offer.part1;

/**
 * @ClassName Singleton2
 * @Description 单例模式--懒汉模式(线程安全的)
 * @Author meimingzhi
 * @Date 2020/2/11 4:20 下午
 */
public class Singleton2 {
    private static Singleton2 INSTANCE;
    private Singleton2(){}

    public static Singleton2 getInstance(){
        if (INSTANCE != null){
            return INSTANCE;
        }
        synchronized (Singleton2.class){
            if (INSTANCE == null){
                INSTANCE = new Singleton2();
            }
            return INSTANCE;
        }
    }
}
