package com.example.spring.gof;

public abstract class Manager implements Persons {
    protected Persons persons;
    public void doCoding() {
        persons.doCoding();
    }
}
