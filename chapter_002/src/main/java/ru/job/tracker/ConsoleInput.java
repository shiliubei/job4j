package ru.job.tracker;

import java.util.*;

public class ConsoleInput implements Input {
    public Scanner scan = new Scanner(System.in);


    public String ask(String question) {
        System.out.print(question);
        return scan.next();
    }

}
