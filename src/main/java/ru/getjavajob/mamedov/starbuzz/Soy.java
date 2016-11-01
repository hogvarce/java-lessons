package ru.getjavajob.mamedov.starbuzz;

/**
 * Created by Ganzhenko on 28.10.2016.
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;
    private Size size;

    public Soy(Beverage beverage, Size size) {
        this.beverage = beverage;
        this.size = size;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return (.10 * size.getValue()) + beverage.cost();
    }



}
