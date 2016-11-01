package ru.getjavajob.mamedov.homework11;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Ganzhenko on 17.10.2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
//        String text = "раорпафаЭЗФпрЗУКпмгоаждвоипзщивадоимдлвыариывигэшерикзщмйщмралрпалпрфшщпвнара";
//        CountLetterImpl[] threads = new CountLetterImpl[33];
//        for (int i = 0; i < threads.length; i++) {
//            threads[i] = new CountLetterImpl();
//            threads[i].setLetter((char) (i + 1072));
//            threads[i].setText(text);
//        }
//
//        for (CountLetterImpl thread : threads) {
//            thread.join();
//        }
//        CopyOnWriteArrayList<ThreadResult> resultList = new CopyOnWriteArrayList<>();
//        for (CountLetterImpl thread : threads) {
//            resultList.add(new ThreadResult().setName(String.valueOf(thread.getLetter())).setValue(thread.getCounter()));
//        }
//        Collections.sort(resultList);
//        for (ThreadResult result : resultList) {
//            System.out.println("thread#" + result.getName() + " " + result.getValue());
//        }

        int[] arr = new int[99];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + (int)(Math.random() * 99);
        }

        ThreadQuickSort quick = new ThreadQuickSort(arr, 0, arr.length-1);

        ExecutorService executorService = Executors.newFixedThreadPool(arr.length-1);

        executorService.invokeAll(quick.taskList).stream();


        for (int i : quick.getArr()) {
            System.out.println(i);
        }

    }

}
