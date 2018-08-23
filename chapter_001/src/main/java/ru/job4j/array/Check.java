package ru.job4j.array;

/**
 * Is the array consist of only true or false.
 *
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $0.1$
 * @since 22.08.18
 */
public class Check {
    /**
     * take first element and compare it with others, if found something different then break.
     *
     * @param data array of boolean.
     * @return mono - returns true if there are only true or false, and false if not.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            if (data[0] != data[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}