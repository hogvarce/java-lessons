package ru.getjavajob.mamedov.homework5;

import java.util.stream.IntStream;

/**
 * Created by Ganzhenko on 27.09.2016.
 */
public class ArrayWithInt {

    private int[] array = new int[1000000];

    public  void full() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 5);
        }
    }

    public int summ() {
        return IntStream.of(array).reduce((s, i) -> s += i).getAsInt();
    }
}
