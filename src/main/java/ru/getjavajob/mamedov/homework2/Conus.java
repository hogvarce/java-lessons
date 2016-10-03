package ru.getjavajob.mamedov.homework2;

/**
 * Created by Ganzhenko on 21.09.2016.
 */
public class Conus extends Circle implements IRotatingShape {
    private String title = "Конус";
    private double height;

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


    @Override
    public double getVolume() {
        return (this.getRadiusBase() * this.height)/3;
    }

    @Override
    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getRadiusBase() {
        return super.getSquare();
    }
}
