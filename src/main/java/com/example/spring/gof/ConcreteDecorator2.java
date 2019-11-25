package com.example.spring.gof;

/**
 * ConcreteDecorator
 * 具体装饰器角色
 * 完成具体的装饰功能.装饰功能的实现是通过调用被装饰对象对应的方法,加上装饰对象自身的方法
 * 可以有多个具体装饰角色,但是要注意各装饰之间的调用顺序
 */
public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }
    @Override
    public void doSomeThing() {
        super.doSomeThing();
        this.doAnthorThing();
    }
    public void doAnthorThing() {
        System.out.println("功能C");
    }
}
