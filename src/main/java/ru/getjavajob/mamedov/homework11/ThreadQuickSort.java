package ru.getjavajob.mamedov.homework11;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

/**
 * Created by Ganzhenko on 18.10.2016.
 */

public class ThreadQuickSort implements Callable<int[]> {
    
    private int[] arr;
    private int low, high;
    public static List<Callable<int[]>> taskList = new ArrayList<>();

    public ThreadQuickSort (int[] arr, int low, int high) {
        this.arr = arr;
        this.low = low;
        this.high = high;

    }

    public int[] getArr() {
        return arr;
    }


    public void run() {

        if (arr == null || arr.length == 0)
            return;

        if (low >= high)
            return;

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            new ThreadQuickSort(arr, low, j);

        if (high > i)
            new ThreadQuickSort(arr, i, high);
    }

    @Override
    public int[] call() throws Exception {
        taskList.add((Callable<int[]>) this);
        if (arr == null || arr.length == 0)
            return arr;

        if (low >= high)
            return arr;

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            new ThreadQuickSort(arr, low, j);

        if (high > i)
            new ThreadQuickSort(arr, i, high);
        return arr;
    }
}
