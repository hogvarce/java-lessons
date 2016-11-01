package ru.getjavajob.mamedov.ObserverPattern;

/**
 * Created by Ganzhenko on 27.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        WeatherData weatherData2 = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        currentConditionsDisplay.setObservable(weatherData);
        currentConditionsDisplay.setObservable(weatherData2);


        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData2.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.3f);

    }
}
