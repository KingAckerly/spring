package com.example.spring.command;

public class CommandTest {
    public static void main(String[] args) {
        Executor executor = new Executor();
        Command1 command1 = new Command1(executor);
        Command2 command2 = new Command2(executor);
        Agent agent = new Agent();
        agent.addCommand(command1);
        agent.addCommand(command2);
        agent.notifyCommand();
    }
}
