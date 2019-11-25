package com.example.spring;

public class Teacher implements Cloneable {
    private String name;
    private String addr;
    private int height;

    public String getName() {
        return name;
    }

    public Teacher setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddr() {
        return addr;
    }

    public Teacher setAddr(String addr) {
        this.addr = addr;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public Teacher setHeight(int height) {
        this.height = height;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teacher{");
        sb.append("name='").append(name).append('\'');
        sb.append(", addr='").append(addr).append('\'');
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }

    @Override
    protected Object clone() {
        Teacher teacher = null;
        try {
            teacher = (Teacher) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return teacher;
    }
}
