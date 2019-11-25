package com.example.spring.gof;

public class ManagerB extends Manager {
    public ManagerB(Persons persons) {
        this.persons = persons;
    }

    @Override
    public void doCoding() {
        super.doCoding();
        doEnd();
    }

    private void doEnd() {
        System.out.println("项目经理B处理后期事项");
    }
}
