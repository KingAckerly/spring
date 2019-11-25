package com.example.spring.test;


import com.example.spring.gof.*;

/**
 * 适配器模式测试
 */
public class AdapterPatternTest {
    public static void main(String[] args) {
        /*Target target = new TargetImpl();
        target.targetMethod();
        Adapter adapteeAdapter = new Adapter(new AdapteeImpl());
        adapteeAdapter.targetMethod();
        Adaptee adaptee = new AdapteeImpl();
        adaptee.adapteeMethod();
        Adapter targetAdapter = new Adapter(new TargetImpl());
        targetAdapter.adapteeMethod();*/


        //猫自己
        Icat cat = new CatImpl();
        cat.catLooks();//我有猫的外表
        cat.zhuoshu();//我能抓老鼠
        //把狗适配成猫
        Icat fakerCat = new Adapters(new DogImpl());
        fakerCat.catLooks();//我是一只猫
        fakerCat.zhuoshu();//我会狗叫
        //狗自己
        Idog idog = new DogImpl();
        idog.dogLooks();//我有狗的外表
        idog.goujiao();//我会狗叫
        //把猫适配成狗
        Idog fakerDog = new Adapters(new CatImpl());
        fakerDog.dogLooks();//我是一只狗
        fakerDog.goujiao();//我能抓老鼠
    }
}
