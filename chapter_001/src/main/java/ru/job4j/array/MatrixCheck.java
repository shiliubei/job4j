package ru.job4j.array;

/**
 * Class for matrix check.
 *
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $0.1$
 * @since 22.08.18
 */
public class MatrixCheck {
    /**
     * Are the elements of each diagonal of matrix only true or only false.
     *
     * @param data square matrix.
     * @return result - true or false.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int index = 1; index < data.length; index++) {
            if (data[0][0] != data[index][index]) {
                result = false;
                break;
            }
            if (data[0][data.length - 1] != data[index][data.length - 1 - index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}