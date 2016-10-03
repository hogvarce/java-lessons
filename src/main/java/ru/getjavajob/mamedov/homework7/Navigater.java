package ru.getjavajob.mamedov.homework7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Ganzhenko on 29.09.2016.
 */
public class Navigater {

    private String path;
    private NavigableSet<String> set = new TreeSet<>();

    public String getPath() {
        return path;
    }

    public Navigater setPath(String path) {
        this.path = path;
        return this;
    }

    public Navigater parse() {
        File file = new File(path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while(scanner.hasNext()) {
                set.add(scanner.next().toLowerCase().replaceAll(",", ""));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            return this;
        }
    }
    public String compare(String comparator) {
        return set.ceiling(comparator.toLowerCase());
    }

}
