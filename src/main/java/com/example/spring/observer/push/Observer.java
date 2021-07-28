package com.example.spring.observer.push;

/**
 * 抽象观察者角色
 */
public interface Observer {
    void update(String message, String addr);

    String getName();
}
