package com.example.spring.observer.push;

/**
 * 具体主题角色
 */
public class ConcreteSubject extends Subject {

    /**
     * 状态
     */
    private String message;

    public String getMessage() {
        return message;
    }

    public void change(String newMessage) {
        message = newMessage;
        System.out.println("微信服务更新消息:" + newMessage);
        System.out.println("开始通知观察者...");
        super.nodifyObservers(message);
    }
}
