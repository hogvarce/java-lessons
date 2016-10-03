package ru.getjavajob.mamedov.homework2;

/**
 * Created by Ganzhenko on 21.09.2016.
 */
public class Pyramid extends Polygone implements ITransitionShape {

    private String title = "Пирамида";
    private double height;

    @Override
    public double getVolume() {
        return (height * getAreaBase())/3;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

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
    public double getAreaBase() {
        return super.getSquare();
    }
}
