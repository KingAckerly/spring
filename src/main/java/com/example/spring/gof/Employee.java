package com.example.spring.gof;

public class Employee implements Persons {
    @Override
    public void doCoding() {
        System.out.println("程序员实现功能需求");
    }
}
