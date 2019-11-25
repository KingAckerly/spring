package com.example.spring.gof;

public class Adapters implements Icat, Idog {
    private Icat cat;
    private Idog dog;
    public Adapters(Icat cat) {
        this.cat = cat;
    }
    public Adapters(Idog dog) {
        this.dog = dog;
    }
    @Override
    public void catLooks() {
        System.out.println("我是一只猫");
    }
    @Override
    public void zhuoshu() {
        dog.goujiao();
    }
    @Override
    public void dogLooks() {
        System.out.println("我是一只狗");
    }
    @Override
    public void goujiao() {
        cat.zhuoshu();
    }
}
