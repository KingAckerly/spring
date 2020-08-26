package com.example.spring.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 中间人
 */
public class Agent {
    /**
     * 命令列表
     */
    private List<AbstractCommand> commands = new ArrayList<>();

    /**
     * 添加命令
     *
     * @param command
     */
    public void addCommand(AbstractCommand command) {
        commands.add(command);
    }

    /**
     * 移除命令
     *
     * @param command
     */
    public void removeCommand(AbstractCommand command) {
        commands.remove(command);
    }

    /**
     * 通知执行命令
     */
    public void notifyCommand() {
        for (AbstractCommand command : commands) {
            command.excuteCommand();
        }
    }
}
