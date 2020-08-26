package com.example.spring.strategy;

/**
 * 算法乘实现类
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
