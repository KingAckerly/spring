package com.example.spring.gof;

/**
 * ConcreteComponent
 * 具体装饰对象角色
 * 具体被装饰对象,它继承Component,并实现需要被装饰的方法
 */
public class ConcreteComponent implements Component {
    @Override
    public void doSomeThing() {
        System.out.println("功能A");
    }
}
