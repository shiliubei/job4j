package ru.job4j.array;

/**
 * raising the number of array to the second power.
 *
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $0.1$
 * @since 22.08.18
 */
public class Square {
    /**
     * rising to second power by multiplication of each number by itself.
     *
     * @param bound quantity of numbers in array.
     * @return rst - array of numbers.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (i + 1) * (i + 1);
        }
        return rst;
    }
}