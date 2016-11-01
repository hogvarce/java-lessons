package ru.getjavajob.mamedov.starbuzz;

/**
 * Created by Ganzhenko on 28.10.2016.
 */
public class DarkRoast extends Beverage {


    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 2;
    }
}
