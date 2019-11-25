package com.example.spring.gof;

/**
 * 目标角色实现类
 */
public class TargetImpl implements Target {
    /**
     * 目标方法实现
     */
    @Override
    public void targetMethod() {
        System.out.println("this is targetMethod");
    }
}
