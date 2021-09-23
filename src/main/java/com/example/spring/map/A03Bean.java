package com.example.spring.map;

/**
 * 用于调试hashmap的bean
 * 重写了hashcode和equals,目的是让put进hashmap的对象在同一个数组位置上
 */
public class A03Bean {
    protected int number;

    public A03Bean(int number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        return number % 4;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        A03Bean other = (A03Bean) obj;
        if (number != other.number)
            return false;
        return true;
    }
}
