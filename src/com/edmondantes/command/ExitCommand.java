package com.edmondantes.command;

import com.edmondantes.ConsoleHelper;

public class ExitCommand implements Command {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("До встречи!");
    }
}
