package ru.getjavajob.mamedov.starbuzz;

/**
 * Created by Ganzhenko on 28.10.2016.
 */
public class Espresso extends Beverage {


    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
