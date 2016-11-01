package ru.getjavajob.mamedov.homework11;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Created by Ganzhenko on 18.10.2016.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ThreadResult implements Comparable<ThreadResult> {
    private String name;
    private int value;

    @Override
    public int compareTo(ThreadResult o) {
        return this.value == o.value ? 0 : this.value > o.value ? -1 : 1;
    }
}
