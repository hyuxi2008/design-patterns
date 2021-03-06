package com.mindflow.pattern.singleton.ch1;

/**
 * 单例模式-饿汉式
 *
 * @author Ricky Fung
 * @create 2016-07-13 16:21
 */
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton(){
        System.out.println("new Singleton instance");
    }

    public static Singleton getInstance(){
        return INSTANCE;
    }
}
