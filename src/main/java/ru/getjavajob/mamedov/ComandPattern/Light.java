package ru.getjavajob.mamedov.ComandPattern;

/**
 * Created by Ganzhenko on 01.11.2016.
 */
public class Light {
    private String place;

    public Light(String s) {
        place = s;
    }

    public void on() {
        System.out.println("Light`s on");
    }

    public void off() {
        System.out.println("Light`s off");
    }
}
