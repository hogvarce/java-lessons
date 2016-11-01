package ru.getjavajob.mamedov.starbuzz;

/**
 * Created by Ganzhenko on 28.10.2016.
 */
public class RoundCost {
    public static double round(float value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
