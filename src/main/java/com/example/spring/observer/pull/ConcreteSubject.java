package com.example.spring.observer.pull;

/**
 * 具体主题角色
 */
public class ConcreteSubject extends Subject {

    /**
     * 状态
     */
    private String message;
    private String addr;

    public String getMessage() {
        return message;
    }

    public String getAddr() {
        return addr;
    }

    public void change(String newMessage) {
        message = newMessage;
        addr = "这是地址";
        System.out.println("微信服务更新消息:" + newMessage);
        System.out.println("开始通知观察者...");
        super.nodifyObservers();
    }
}
