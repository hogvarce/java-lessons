package ru.getjavajob.mamedov.starbuzz;

/**
 * Created by Ganzhenko on 28.10.2016.
 */
public class HouseBlend extends Beverage {


    public HouseBlend() {
        description = "House Blend Cofee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
