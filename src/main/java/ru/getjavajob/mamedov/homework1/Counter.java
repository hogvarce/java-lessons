package ru.getjavajob.mamedov.homework1;

/**
 * Created by Ganzhenko on 19.09.2016.
 */
public class Counter {
    private static int count;
    static {
        count = 0;
    }
    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
