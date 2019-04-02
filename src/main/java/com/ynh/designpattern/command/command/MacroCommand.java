package com.ynh.designpattern.command.command;

import java.util.Stack;
import java.util.Iterator;

public class MacroCommand implements Command {
    /**
     * 命令的集合
     */
    private Stack<Command> commands = new Stack<>();

    @Override
    public void execute() {
        Iterator<Command> it = commands.iterator();
        while (it.hasNext()) {
            it.next().execute();
        }
    }

    /**
     * 添加命令
     */
    public void append(Command cmd) {
        if (cmd != this) {
            //防止不小心将自己添加进去，造成死循环
            commands.push(cmd);
        }
    }

    /**
     * 删除最后一条命令
     */
    public void delete() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    /**
     * 删除所有命令
     */
    public void clear() {
        commands.clear();
    }
}
