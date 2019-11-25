package com.example.spring.gof;

import java.io.Serializable;

public class Monkey implements Cloneable, Serializable {
    private MonkeyInfo monkeyInfo;

    public MonkeyInfo getMonkeyInfo() {
        return monkeyInfo;
    }

    public Monkey setMonkeyInfo(MonkeyInfo monkeyInfo) {
        this.monkeyInfo = monkeyInfo;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Monkey{");
        sb.append("monkeyInfo=").append(monkeyInfo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Object clone() {
        Monkey monkey = null;
        try {
            monkey = (Monkey) super.clone();
            monkey.monkeyInfo = (MonkeyInfo) this.monkeyInfo.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return monkey;
    }
}
