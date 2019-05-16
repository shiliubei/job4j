package ru.job.tracker;


/**
 * Functional interface.
 */

public interface Input {

    String ask(String question);

    int ask(String question, int[] range);
}
