package ru.getjavajob.mamedov.homework7;


/**
 * Created by Ganzhenko on 29.09.2016.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Реверс массива строк\n----------------------------");

        CollectionRevers collection = new CollectionRevers();
        collection.add("asdasd", "asdsd", "asdasd");
        System.out.println(collection.fetch().reverse().get());

        System.out.println("Чтение из файла и сортровка\n----------------------------");

        Navigater nav = new Navigater();
        nav.setPath("src/main/resources/text.txt").parse();
        System.out.println(nav.compare("S"));
    }
}
