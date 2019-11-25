package com.example.spring.gof;

/**
 * Compoent
 * 抽象装饰对象角色
 * 被装饰对象的基类,提供被装饰得方法,被装饰对象和装饰器都实现该接口
 */
public interface Component {
    void doSomeThing();
}
