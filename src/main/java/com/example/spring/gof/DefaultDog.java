package com.example.spring.gof;

/**
 * 适配器角色
 */
public class DefaultDog implements Dog {
    @Override
    public void run() {
        System.out.println("奔跑");
    }
    @Override
    public void swim() {
        System.out.println("游泳");
    }
    @Override
    public void sleep() {
        System.out.println("睡觉");
    }
}
