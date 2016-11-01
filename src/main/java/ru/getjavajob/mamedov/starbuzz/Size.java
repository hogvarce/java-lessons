package ru.getjavajob.mamedov.starbuzz;

/**
 * Created by Ganzhenko on 28.10.2016.
 */
public enum Size {
    SMALL(1), MEDIUM(.5), LARGE(2);
    private double value;

    Size(double i) {
        this.value = i;
    }

    public double getValue() {
        return value;
    }
}
