package ru.getjavajob.mamedov.ComandPattern;

/**
 * Created by Ganzhenko on 01.11.2016.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.off();
    }
}
