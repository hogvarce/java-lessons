package ru.getjavajob.mamedov.ObserverPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by Ganzhenko on 27.10.2016.
 */
public class WeatherData extends Observable {


    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }


    public void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
