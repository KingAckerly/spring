package com.example.spring.gof;

import java.io.Serializable;

public class MonkeyInfo implements Cloneable, Serializable {
    private int sex;
    private Integer age;
    private String name;

    public int getSex() {
        return sex;
    }

    public MonkeyInfo setSex(int sex) {
        this.sex = sex;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public MonkeyInfo setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public MonkeyInfo setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MonkeyInfo{");
        sb.append("sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Object clone() {
        MonkeyInfo monkeyInfo = null;
        try {
            monkeyInfo = (MonkeyInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return monkeyInfo;
    }
}
