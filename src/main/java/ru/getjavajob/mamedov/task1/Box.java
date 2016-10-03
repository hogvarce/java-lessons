package ru.getjavajob.mamedov.task1;

class Box {
    private double width, height, depth;



    double calculateVolume() {
        return width * height * depth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
}