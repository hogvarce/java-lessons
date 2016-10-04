package ru.getjavajob.mamedov.homework8.services;

public enum SortMethod {
    BUBBLE(1), QUICK(2), SHELLA(3);

    private int priority;

    SortMethod(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
