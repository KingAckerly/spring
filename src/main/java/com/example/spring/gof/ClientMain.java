package com.example.spring.gof;

public class ClientMain {
    public static void main(String args[]) {
        Persons employee = new Employee();
        employee = new ManagerA(employee);//赋予程序猿项目经理A职责
        employee = new ManagerB(employee);//赋予程序猿项目经理B职责
        employee.doCoding();
    }
}
