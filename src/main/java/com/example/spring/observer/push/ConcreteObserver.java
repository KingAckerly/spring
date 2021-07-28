package com.example.spring.observer.push;

/**
 * 具体观察者
 */
public class ConcreteObserver implements Observer {

    private String name;
    private String message;
    private String addr;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAddr() {
        return addr;
    }

    public ConcreteObserver setAddr(String addr) {
        this.addr = addr;
        return this;
    }

    @Override
    public void update(String message, String addr) {
        //收到推送消息
        this.message = message;
        this.addr = addr;
        System.out.println(getName() + "收到推送消息：" + message);
        System.out.println(getName() + "收到推送消息：" + addr);
    }

    @Override
    public String getName() {
        return name;
    }
}
