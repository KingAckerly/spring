package com.example.spring.gof;

/**
 * 建造者模式-Director类
 */
public class PersonDirector {
    public Person constructPerson(PersonBuilder pb) {
        //按照 身体>头部>四肢 顺序创建人物
        pb.buildBody();
        pb.buildHead();
        pb.buildFoot();
        return pb.buildPerson();
    }
}
