package ru.getjavajob.mamedov.screensaver;

import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

/**
 * Created by Ganzhenko on 26.09.2016.
 */
@Configuration
@ComponentScan(basePackages = "ru.getjavajob.mamedov.screensaver")
public class Config {
    @Bean
    @Scope("periodical")
    public Color color() {
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    @Bean
    public ColorFrame frame() {
        return new ColorFrame() {
            @Override
            protected Color getColor() {
                return color();
            }
        };
    }
}
