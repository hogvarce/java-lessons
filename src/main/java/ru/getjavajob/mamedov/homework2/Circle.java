package ru.getjavajob.mamedov.homework2;

/**
 * Created by Ganzhenko on 21.09.2016.
 */
public class Circle implements IFigure{

    private String title = "Круг";
    private double radius;

    @Override
    public String toSting() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        return false;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

}
