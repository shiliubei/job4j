package ru.job.convertation;

import java.util.List;

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells;
        int listSize = list.size();
        if (listSize % rows == 0) {
            cells = listSize / rows;
        } else {
            cells = listSize / rows + 1;
        }
        int[][] array = new int[rows][cells];
        int j = -1;
        int k = -1;
        for (Integer i : list) {
            array[(++j) / rows][(++k) % cells] = i;
        }
        return array;
    }
}