package com.example.spring.strategy;

/**
 * 算法减实现类
 */
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
