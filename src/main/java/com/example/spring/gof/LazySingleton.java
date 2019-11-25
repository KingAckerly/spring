package com.example.spring.gof;

/**
 * 多线程懒汉式单例
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    /**
     * private 避免类在外部被实例化
     */
    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        System.out.println("xx");
        if (instance == null) {
            instance = new LazySingleton();
        } else {
            System.out.println("异常");
        }
        return instance;
    }
}
