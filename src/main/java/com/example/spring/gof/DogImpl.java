package com.example.spring.gof;

public class DogImpl implements Idog {
    @Override
    public void dogLooks() {
        System.out.println("我有狗的外表");
    }
    @Override
    public void goujiao() {
        System.out.println("我会狗叫");
    }
}
