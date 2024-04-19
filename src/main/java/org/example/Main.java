package org.example;

import org.example.Commandpattern.*;
import org.example.Facadepattern.Facade;
import org.example.Startegypattern.*;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        ICommand lightOnCommand = new LightOnCommand(light);
        ICommand lightOffCommand = new LightOffCommand(light);

        LightSwitch lightSwitch = new LightSwitch();
        lightSwitch.setCommand(lightOnCommand);
        lightSwitch.use();

        lightSwitch.setCommand(lightOffCommand);
        lightSwitch.use();
    }
}