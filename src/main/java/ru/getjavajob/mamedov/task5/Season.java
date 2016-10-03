package ru.getjavajob.mamedov.task5;

/**
 * Created by Ganzhenko on 26.09.2016.
 */
public enum Season {
    WINTER("Зима"),
    SUMMER("Лето"),
    SPRING("Весна"),
    AUTOMN("Осень");

    private String localName;

    Season(String localName) {
        this.localName = localName;
    }

    public String getLocalName() {
        return localName;
    }
}
