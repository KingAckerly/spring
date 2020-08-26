package com.example.spring.strategy;

/**
 * 上下文
 */
public class Context {
    /**
     * 策略对象
     */
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 执行策略
     *
     * @param num1
     * @param num2
     * @return
     */
    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
