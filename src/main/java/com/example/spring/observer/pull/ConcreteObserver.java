package com.example.spring.observer.pull;

/**
 * 具体观察者
 */
public class ConcreteObserver implements Observer {

    private String name;
    private String message;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void update(Subject subject) {
        // 主动去主题里拿数据
        message = ((ConcreteSubject) subject).getMessage();
        //String addr = ((ConcreteSubject) subject).getAddr();
        System.out.println(getName() + "收到推送消息：" + message);
        //System.out.println(getName() + "地址：" + addr);
    }

    @Override
    public String getName() {
        return name;
    }
}
