package com.algorithm.offer.part1;

/**
 * @ClassName Singleton4
 * @Description 内部类形式的单例模式
 * @Author meimingzhi
 * @Date 2020/2/11 4:28 下午
 */
public class Singleton4 {
    private static InnerSingleton innerSingleton = new InnerSingleton();
    public static Singleton4 getInstance(){
        return innerSingleton.getInstance();
    }
    static class InnerSingleton{
        private Singleton4 instance = new Singleton4();
        private InnerSingleton(){}
        public Singleton4 getInstance(){
            return instance;
        }
    }
}
