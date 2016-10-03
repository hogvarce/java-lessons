package ru.getjavajob.mamedov.task3;

/**
 * Created by Ganzhenko on 21.09.2016.
 */
public class Main {

    public static void main(String[] args) {
        A a = new B();
        a.executeMethod(new Object());
    }
}

class A {
    public void executeMethod(Object o) {
        System.out.println("executeMethod(Object o) in A");
    }
}

class B extends A {
    public void executeMethod(String o) {
        System.out.println("executeMethod(Object o) in B");
    }
}
