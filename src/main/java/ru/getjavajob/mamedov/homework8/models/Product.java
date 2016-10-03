package ru.getjavajob.mamedov.homework8.models;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Ganzhenko on 03.10.2016.
 */
public class Product {
    private String id;
    private double price;
    private String title;

    public Product() {
        id = UUID.randomUUID().toString();
    }

    public String  getId() {
        return id;
    }

    @Override
    public String toString() {
        String output = "title - " + title + ", price - " + price;
        return output;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
