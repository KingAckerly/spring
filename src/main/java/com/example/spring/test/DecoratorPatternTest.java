package com.example.spring.test;

import com.example.spring.gof.Component;
import com.example.spring.gof.ConcreteComponent;
import com.example.spring.gof.ConcreteDecorator1;
import com.example.spring.gof.ConcreteDecorator2;

/**
 * 装饰器模式测试
 */
public class DecoratorPatternTest {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.doSomeThing();
        //功能A
        System.out.println("------------------");
        Component component1 = new ConcreteDecorator1(new ConcreteComponent());
        component1.doSomeThing();
        //功能A
        //功能B
        System.out.println("------------------");
        Component component2 = new ConcreteDecorator2(new ConcreteDecorator1(new ConcreteComponent()));
        component2.doSomeThing();
        //功能A
        //功能B
        //功能C
    }
}
