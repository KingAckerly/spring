package com.example.spring.gof;

/**
 * 建造者模式-Builder接口
 */
public interface PersonBuilder {
    void buildHead();
    void buildBody();
    void buildFoot();
    /**
     * //组装
     *
     * @return
     */
    Person buildPerson();
}
