package com.example.spring.gof;

/**
 * 饿汉式单例
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    /**
     * private 避免类在外部被实例化
     */
    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
