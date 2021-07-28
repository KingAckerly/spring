package com.example.spring.observer.pull;

/**
 * 抽象观察者角色
 */
public interface Observer {
    /**
     * 传入主题，获取中的对象
     *
     * @param subject
     */
    void update(Subject subject);

    String getName();
}
