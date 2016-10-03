package ru.getjavajob.mamedov.task1;

public class Main {
    public static void main(String[] args) {
        example1();
    }

    private static void example1() {
        Box b1 = new Box();
        b1.setWidth(10);
        b1.setHeight(20);
        b1.setDepth(30);
        Box b2 = b1;
        System.out.println("Example 1: Box 1 width: " + b2.calculateVolume());
        System.out.println("asdad");
    }
}