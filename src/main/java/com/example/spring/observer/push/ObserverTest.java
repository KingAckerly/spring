package com.example.spring.observer.push;

public class ObserverTest {
    public static void main(String[] args) {
        Observer o1 = new ConcreteObserver("o1");
        Observer o2 = new ConcreteObserver("o2");
        Observer o3 = new ConcreteObserver("o3");
        ConcreteSubject csj = new ConcreteSubject();
        csj.register(o1);
        csj.register(o2);
        csj.register(o3);
        csj.remove(o2);
        csj.change("PHP是世界上最好用的语言！");
    }
}
