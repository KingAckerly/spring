package com.example.spring.command;

/**
 * 命令抽象类
 */
public abstract class AbstractCommand {

    /**
     * 执行人
     */
    protected Executor executor;

    public AbstractCommand(Executor executor) {
        this.executor = executor;
    }

    /**
     * 执行命令的抽象方法
     */
    public abstract void excuteCommand();
}
