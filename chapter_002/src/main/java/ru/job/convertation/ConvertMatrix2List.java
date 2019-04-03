package ru.job.convertation;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[0].length; k++){
                list.add(array[i][k]);
            }
        }
        return list;
    }
}