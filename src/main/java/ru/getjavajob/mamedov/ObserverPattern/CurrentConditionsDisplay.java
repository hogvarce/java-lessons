package ru.getjavajob.mamedov.ObserverPattern;

import java.util.*;

/**
 * Created by Ganzhenko on 27.10.2016.
 */
public class CurrentConditionsDisplay implements java.util.Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Observable observable;


    public void setObservable(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

//    @Override
//    public void update(float temperature, float humidity, float pressure) {
//        this.temperature = temperature;
//        this.humidity = humidity;
//        display();
//    }

    @Override
    public void display() {
        System.out.println("Current condition: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
