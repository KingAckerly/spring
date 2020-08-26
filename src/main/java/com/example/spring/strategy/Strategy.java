package com.example.spring.strategy;

/**
 * 策略抽象接口
 */
public interface Strategy {
    /**
     * 操作方法
     *
     * @param num1
     * @param num2
     * @return
     */
    int doOperation(int num1, int num2);
}
