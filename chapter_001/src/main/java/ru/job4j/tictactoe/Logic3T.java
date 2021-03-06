package ru.job4j.tictactoe;

/**
 * Simple logic for tictactoe.
 *
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $0.1$
 * @since 27.08.18
 */
public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    /**
     * Method that watching is X winner or not.
     * It count X marked cells of every row(use horizontalCount) and column (use verticalCount)
     * After each iteration of external loop horizontalCount and verticalCount are reset to zero.
     *
     * @return true if X winner, false if not.
     */
    public boolean isWinnerX() {
        int verticalCount = 0;
        int horizontalCount = 0;
        int firstDiagonal = 0;
        int secondDiagonal = 0;
        for (int row = 0; row < 3; row++) {
            verticalCount = 0;
            horizontalCount = 0;
            for (int column = 0; column < 3; column++) {
                if (this.table[row][column].hasMarkX()) {
                    verticalCount++;
                }
                if (this.table[column][row].hasMarkX()) {
                    horizontalCount++;
                }
            }
            if (this.table[row][row].hasMarkX()) {
                firstDiagonal++;
            }
            if (this.table[row][2 - row].hasMarkX()) {
                secondDiagonal++;
            }
            if (verticalCount == 3 || horizontalCount == 3 || firstDiagonal == 3 || secondDiagonal == 3) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method that watching is O winner or not.
     *
     * @return true if O winner, false if not.
     */
    public boolean isWinnerO() {
        int verticalCount;
        int horizontalCount;
        int firstDiagonal = 0;
        int secondDiagonal = 0;
        for (int row = 0; row < 3; row++) {
            verticalCount = 0;
            horizontalCount = 0;
            for (int column = 0; column < 3; column++) {
                if (this.table[row][column].hasMarkO()) {
                    verticalCount++;
                }
                if (this.table[column][row].hasMarkO()) {
                    horizontalCount++;
                }
                if (this.table[row][row].hasMarkO()) {
                    firstDiagonal++;
                }
                if (this.table[row][2 - row].hasMarkO()) {
                    secondDiagonal++;
                }
            }
            if (verticalCount == 3 || horizontalCount == 3 || firstDiagonal == 3 || secondDiagonal == 3) {
                return true;
            }
        }
        return false;
    }


    /**
     * Method that checking are the any void cells.
     *
     * @return true if there are, false if have no void cells.
     */
    public boolean hasGap() {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                if (!this.table[row][column].hasMarkO() && !this.table[row][column].hasMarkX()) {
                    return true;
                }
            }
        }
        return false;


    }
}
