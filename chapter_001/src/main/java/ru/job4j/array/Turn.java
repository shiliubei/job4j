package ru.job4j.array;

/**
 * backward array without using a buffer variable
 *
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $0.1$
 * @since 22.08.18
 */
public class Turn {
    /**
     * change elements from first one up to middle element except middle element.
     *
     * @param array initial array.
     * @return array - backward array.
     */
    public int[] turn(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = array[i] + array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i] - array[array.length - 1 - i];
            array[i] = array[i] - array[array.length - 1 - i];
        }
        return array;
    }
}