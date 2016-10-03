package ru.getjavajob.mamedov.task5;

/**
 * Created by Ganzhenko on 23.09.2016.
 */
public enum Apple {
    Jonathan(10);
    private int price;

    Apple(int p) {
        price = p;
    }

    public int getPrice() {
        return price;
    }

}
