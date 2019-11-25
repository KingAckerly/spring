package com.example.spring.gof;

/**
 * Decorator
 * 装饰器角色
 * 持有一个Component对象的实例
 */
public class Decorator implements Component {
    private Component component;
    public Decorator(Component component) {
        this.component = component;
    }
    @Override
    public void doSomeThing() {
        component.doSomeThing();
    }
}
