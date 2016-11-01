package ru.getjavajob.mamedov.Swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ganzhenko on 28.10.2016.
 */
public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {
        frame = new JFrame();
        JButton jButton = new JButton("Should I do it?");
        jButton.addActionListener(new AngelListener());
        jButton.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, jButton);
        frame.setVisible(true);
    }
}
