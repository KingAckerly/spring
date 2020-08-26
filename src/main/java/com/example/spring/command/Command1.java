package com.example.spring.command;

/**
 * 命令1
 */
public class Command1 extends AbstractCommand {

    public Command1(Executor executor) {
        super(executor);
    }

    @Override
    public void excuteCommand() {
        System.out.println("执行命令1");
    }

    @Override
    public String toString() {
        return "命令1";
    }
}
