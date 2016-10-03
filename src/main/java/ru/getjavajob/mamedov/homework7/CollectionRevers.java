package ru.getjavajob.mamedov.homework7;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Ganzhenko on 29.09.2016.
 */
public class CollectionRevers {
    private List<String> list;
    private ListIterator<String> litr;
    public CollectionRevers () {
        list = new ArrayList<>();
        litr = list.listIterator();
    }
    public void add(String... arr) {
        for (String str : arr) {
            list.add(str);
        }
    }
    public CollectionRevers fetch() {
        litr = list.listIterator();
        return this;
    }
    public CollectionRevers reverse () {
        while (litr.hasNext()) {
            litr.set(new StringBuilder(litr.next()).reverse().toString());
        }
        return this;
    }
    public List<String> get() {
        return list;
    }

}
