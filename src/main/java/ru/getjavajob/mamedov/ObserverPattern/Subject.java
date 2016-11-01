package ru.getjavajob.mamedov.ObserverPattern;

/**
 * Created by Ganzhenko on 27.10.2016.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
