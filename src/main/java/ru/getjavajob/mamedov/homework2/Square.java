package ru.getjavajob.mamedov.homework2;

/**
 * Created by Ganzhenko on 21.09.2016.
 */
public class Square implements IFigure{

    private String title = "Прямоугольник";
    private double length, width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getSquare() {
        return width * length;
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
