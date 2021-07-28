package com.example.spring.observer.pull;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题角色类
 */
public abstract class Subject {

    /**
     * 保存观察者的容器
     */
    private List<Observer> list = new ArrayList<>();

    /**
     * 注册观察者
     */
    public void register(Observer o) {
        list.add(o);
        System.out.println("增加了一个观察者:" + o.getName());
    }

    /**
     * 移除观察者
     *
     * @param o
     */
    public void remove(Observer o) {
        System.out.println("移除了一个观察者:" + o.getName());
        list.remove(o);
    }

    /**
     * 通知观察者
     */
    public void nodifyObservers() {
        for (Observer observer : list) {
            observer.update(this);
        }
    }
}
