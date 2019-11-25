package com.example.spring.gof;

public class CatImpl implements Icat {
    @Override
    public void catLooks() {
        System.out.println("我有猫的外表");
    }
    @Override
    public void zhuoshu() {
        System.out.println("我能抓老鼠");
    }
}
