package ru.getjavajob.mamedov.homework5;

import java.util.stream.Stream;

/**
 * Created by Ganzhenko on 27.09.2016.
 */
public class ArrayWithInteger {
    private Integer[] array = new Integer[1000000];

    public  void full() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 5);
        }
    }

    public Integer summ() {
        return Stream.of(array).reduce((s, i) -> s += i).get();
    }
}
