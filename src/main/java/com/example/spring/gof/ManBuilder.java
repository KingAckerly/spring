package com.example.spring.gof;

/**
 * 建造者模式-ConcreteBuilder类
 */
public class ManBuilder implements PersonBuilder {
    Person person;
    public ManBuilder() {
        //创建一个person实例,用于调用set方法
        person = new Person();
    }
    @Override
    public void buildHead() {
        person.setHead("建造头部部分");
    }
    @Override
    public void buildBody() {
        person.setBody("建造身体部分");
    }
    @Override
    public void buildFoot() {
        person.setFoot("建造四肢部分");
    }
    @Override
    public Person buildPerson() {
        //返回一个person实例
        return person;
    }
}
