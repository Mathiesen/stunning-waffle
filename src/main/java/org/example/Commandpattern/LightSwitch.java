package org.example.Commandpattern;

public class LightSwitch {
    private ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void use() {
        command.execute();
    }
}
