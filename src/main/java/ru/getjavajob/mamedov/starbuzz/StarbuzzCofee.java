package ru.getjavajob.mamedov.starbuzz;

/**
 * Created by Ganzhenko on 28.10.2016.
 */
public class StarbuzzCofee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Soy(darkRoast, Size.MEDIUM);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + RoundCost.round((float) darkRoast.cost(), 2));
    }
}
