package com.example.spring.test;

import com.example.spring.gof.Singleton;

import java.lang.reflect.Constructor;


public class BreakSingleton {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("com.example.spring.gof.Singleton");
        Constructor c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        Singleton s1 = (Singleton) c.newInstance();
        Singleton s2 = (Singleton) c.newInstance();//java.lang.RuntimeException: 单例模式正在被攻击
    }
}
