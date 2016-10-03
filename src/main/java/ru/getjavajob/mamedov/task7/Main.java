package ru.getjavajob.mamedov.task7;

import java.util.*;

/**
 * Created by Ganzhenko on 29.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            list.add(i);
        }
        if (!list.isEmpty()) {
            System.out.println(list.get(33));
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");
        System.out.println(map.get("key"));
        Deque<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(22);
        System.out.println(queue.getLast());
        List<Object> strings = new ArrayList<>();
        strings.add("asdsadsd");
        strings.add("asdsd");
        Iterator<Object> it = strings.iterator();
        while (it.hasNext()) {
            Object s = it.next();
            System.out.println(s);
        }
        String s1 = "adad";
        System.out.println(s1.compareTo("d"));

    }
}
