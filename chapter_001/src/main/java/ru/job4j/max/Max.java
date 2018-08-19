package ru.job4j.max;
/**
 * @author Danil Liu ()
 * @version $Id$
 * @since 0.1
 */
public class Max {

    /**
     * finding a greater number from two numbers.
     * @param  first one of two numbers.
     * @param  second one of two numbers.
     * @return summ.
     */
    public int max(int first, int second) {
        int max;
        max = first < second ? second : first;

        return max;
    }
}
