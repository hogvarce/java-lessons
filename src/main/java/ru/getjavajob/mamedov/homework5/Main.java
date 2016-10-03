package ru.getjavajob.mamedov.homework5;

/**
 * Created by Ganzhenko on 27.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        long time1= System.nanoTime();
        ArrayWithInt arrInt = new ArrayWithInt();
        arrInt.full();
        System.out.println(arrInt.summ());
        long time2 = System.nanoTime();
        System.out.println(time2 - time1);
        System.out.println("----------------");
        time1= System.nanoTime();
        ArrayWithInteger arrInteger = new ArrayWithInteger();
        arrInteger.full();
        System.out.println(arrInteger.summ());
        time2 = System.nanoTime();
        System.out.println(time2 - time1);
    }
}
