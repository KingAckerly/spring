package com.example.spring.dutychain;


public class LeaveRequest {
    /**
     * 天数
     */
    private int leaveDays;
    /**
     * 姓名
     */
    private String name;

    public int getLeaveDays() {
        return leaveDays;
    }

    public LeaveRequest setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
        return this;
    }

    public String getName() {
        return name;
    }

    public LeaveRequest setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "LeaveRequest{" +
                "leaveDays=" + leaveDays +
                ", name='" + name + '\'' +
                '}';
    }
}
