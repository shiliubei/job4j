package ru.job4j.array;

/**
 * Multiplication matrix
 *
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $0.1$
 * @since 26.08.18
 */
public class Matrix {
    /**
     * Method multiple.
     *
     * @param size quantity of rows and columns of square matrix.
     * @return matrix.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int rowIndex = 0; rowIndex < size; rowIndex++) {
            for (int columnIndex = 0; columnIndex < size; columnIndex++) {
                table[rowIndex][columnIndex] = (rowIndex + 1) * (columnIndex + 1);
            }
        }
        return table;
    }
}