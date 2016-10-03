package ru.getjavajob.mamedov.homework1;

/**
 * Created by Ganzhenko on 19.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println("All counter created: " + Counter.getCount());
        System.out.println("____________________________");

        Calculator c = new Calculator();
        c.setNum(10);
        c.setOperation("/");
        c.setNum(5);
        System.out.println("Answer: " + c.getAnswer());
        c.setNum(2);
        c.setOperation("*");
        System.out.println("Answer: " + c.getAnswer());

    }
}
