package ru.job.convertation;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] i : array) {
            for (int k : i) {
                list.add(k);
            }
        }
        return list;
    }
}