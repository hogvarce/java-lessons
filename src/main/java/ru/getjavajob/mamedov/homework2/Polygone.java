package ru.getjavajob.mamedov.homework2;

/**
 * Created by Ganzhenko on 21.09.2016.
 */
public class Polygone implements IFigure{

    private String title = "Polygone";

    private double length;
    private int cornersCount;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getCornersCount() {
        return cornersCount;
    }

    public void setCornersCount(int cornersCount) {
        this.cornersCount = cornersCount;
    }

    @Override
    public double getSquare() {
        return ((cornersCount / 4.0) * Math.pow(length, 2))*(1.0 / Math.tan(Math.PI / cornersCount));
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
}
