package com.algorithm.offer.part1;

/**
 * 《剑指offer》第二题
 * @ClassName Singleton
 * @Description 单例模式
 * 参考：https://blog.csdn.net/mnb65482/article/details/80458571
 * @Author meimingzhi
 * @Date 2020/2/11 5:05 下午
 */
public class Test01 {
    /**
     * 饿汉式
     */
    public static class Singleton1{
        private static final Singleton1 instance = new Singleton1();
        private Singleton1(){}
        public Singleton1 getInstance(){
            return instance;
        }
    }

    /**
     * 懒汉式--非线程安全的
     */
    public static class Singleton2{
        private static Singleton2 instance = null;
        private Singleton2(){}
        public Singleton2 getInstance(){
            if (instance == null){
                instance = new Singleton2();
            }
            return instance;
        }
    }

    /**
     * 懒汉式--线程安全的（效率低，每次都要上锁）
     */
    public static class Singleton3{
        private static Singleton3 instance = null;
        private Singleton3(){}
        public synchronized Singleton3 getInstance(){
            if (instance == null){
                instance = new Singleton3();
            }
            return instance;
        }
    }

    /**
     * 懒汉式--线程安全的（效率高，推荐使用）
     */
    public static class Singleton4{
        private static Singleton4 instance = null;
        private Singleton4(){}
        public static Singleton4 getInstance(){
            if (instance == null){
                synchronized (Singleton4.class){
                    if (instance == null){
                        instance = new Singleton4();
                    }
                }
            }
            return instance;
        }
    }

    /**
     * 静态内部类--线程安全（效率高，推荐）
     */
    public static class Singleton5{
        public static class SingletonHolder{
            private static final Singleton5 instance = new Singleton5();
        }
        private Singleton5(){}
        public static Singleton5 getInstance(){
            return SingletonHolder.instance;
        }
    }

    /**
     * 枚举方式
     */
    public enum Singleton6{
        INSTANCE;
        public void method(){}
    }
}
