package ru.getjavajob.mamedov.starbuzz;

/**
 * Created by Ganzhenko on 28.10.2016.
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return 0.50 + beverage.cost();
    }

}
