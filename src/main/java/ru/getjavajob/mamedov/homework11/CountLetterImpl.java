package ru.getjavajob.mamedov.homework11;


/**
 * Created by Ganzhenko on 17.10.2016.
 */
public class CountLetterImpl implements CountLetter, Runnable, Comparable {
    public CountLetterImpl() {
        new Thread(this).start();
    }

    private String text;
    private char letter;
    private int counter = 0;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }


    public int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        for (char c : text.toLowerCase().toCharArray()) {
            if (c == letter) {
                counter++;
            }
        }
    }

    @Override
    public int compareTo(Object o) {
        CountLetterImpl tmp = (CountLetterImpl) o;
        if (tmp.getCounter() < counter) {
            return -1;
        }
        if (tmp.getCounter() > counter) {
            return 1;
        }
        return 0;
    }

    public void join() {
        System.out.println("thread#" + letter + " is ended.");
    }
}
