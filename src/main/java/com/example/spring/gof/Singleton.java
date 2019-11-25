package com.example.spring.gof;


public class Singleton {
    private static boolean flag = false;
    private static Singleton instance = null;
    private Singleton() {
        synchronized (Singleton.class) {
            //false代表第一次调用构造,调用完后改为true,第二次调用构造就会抛出异常,达到防止反射生成多个实例
            if (false == flag) {
                flag = !flag;
            } else {
                throw new RuntimeException("单例模式正在被攻击");
            }
        }
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
