package com.example.spring.gof;

/**
 * 源角色实现
 */
public class AdapteeImpl implements Adaptee {
    /**
     * 源方法实现
     */
    @Override
    public void adapteeMethod() {
        System.out.println("this is adapteeMethod");
    }
}
