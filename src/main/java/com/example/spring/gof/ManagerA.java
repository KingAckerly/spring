package com.example.spring.gof;

public class ManagerA extends Manager {
    public ManagerA(Persons persons) {
        this.persons = persons;
    }

    @Override
    public void doCoding() {
        doEarly();
        super.doCoding();
    }

    private void doEarly() {
        System.out.println("项目经理A处理前期事项");
    }
}
