package com.example.spring.test;

import com.example.spring.gof.ManBuilder;
import com.example.spring.gof.Person;
import com.example.spring.gof.PersonDirector;

/**
 * 建造者模式测试
 */
public class BuilderPatternTest {
    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person person = pd.constructPerson(new ManBuilder());
        System.out.println(person.getBody());//建造身体部分
        System.out.println(person.getHead());//建造头部部分
        System.out.println(person.getFoot());//建造四肢部分
    }
}
