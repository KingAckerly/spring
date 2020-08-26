package com.example.spring.command;

/**
 * 命令2
 */
public class Command2 extends AbstractCommand {

    public Command2(Executor executor) {
        super(executor);
    }

    @Override
    public void excuteCommand() {
        System.out.println("执行命令2");
    }

    @Override
    public String toString() {
        return "命令2";
    }
}
