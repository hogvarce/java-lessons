package ru.getjavajob.mamedov.screensaver;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Ganzhenko on 26.09.2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        while (true) {
            context.getBean(ColorFrame.class).showOnRandomPlace();
            Thread.sleep(100);
        }
    }
}
