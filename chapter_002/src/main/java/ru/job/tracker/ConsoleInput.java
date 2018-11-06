package ru.job.tracker;

import java.util.*;

public class ConsoleInput implements Input {
    public Scanner scan = new Scanner(System.in);


    public String ask(String question) {
        System.out.print(question);
        return scan.next();
    }

    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException("Out of menu range");
        }


    }

}
