package ru.getjavajob.mamedov.homework4.exceptions;

/**
 * Created by Ganzhenko on 23.09.2016.
 */
public class EmptyException extends RuntimeException{

    public EmptyException() {
        super("передано пустое значение!");
    }

}
