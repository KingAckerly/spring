package com.example.spring.gof;

/**
 * 适配器角色
 */
public class Adapter implements Target, Adaptee {
    /**
     * 目标角色对象
     */
    private Target target;
    /**
     * 源角色对象
     */
    private Adaptee adaptee;

    public Adapter(Target target) {
        this.target = target;
    }

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void targetMethod() {
        adaptee.adapteeMethod();
    }

    @Override
    public void adapteeMethod() {
        target.targetMethod();
    }
}
