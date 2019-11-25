package com.example.spring.gof;

/**
 * 真实角色
 */
public class RealHousework implements Housework {
    /**
     * 用户
     */
    private String userName;
    public RealHousework(String userName) {
        this.userName = userName;
    }
    /**
     * 做饭
     */
    @Override
    public void cook() {
        System.out.println(userName + "做饭");
    }
}
