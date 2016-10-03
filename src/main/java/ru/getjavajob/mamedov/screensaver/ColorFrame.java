package ru.getjavajob.mamedov.screensaver;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by Ganzhenko on 26.09.2016.
 */
@org.springframework.stereotype.Component
public abstract class ColorFrame extends JFrame {

    public ColorFrame() throws HeadlessException {
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void showOnRandomPlace() {
        Random random = new Random();
        setLocation(random.nextInt(1200), random.nextInt(700));
        getContentPane().setBackground(getColor());
        repaint();
    }

    protected abstract Color getColor();
}
