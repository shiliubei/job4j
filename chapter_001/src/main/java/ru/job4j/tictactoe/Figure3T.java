package ru.job4j.tictactoe;

import javafx.scene.shape.Rectangle;

/**
 * Class for tictactoe.
 *
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $0.1$
 * @since 27.08.18
 */
public class Figure3T extends Rectangle {
    private boolean markX = false;
    private boolean markO = false;

    public Figure3T() {
    }

    public Figure3T(boolean markX) {
        this.markX = markX;
        this.markO = !markX;
    }

    public void take(boolean markX) {
        this.markX = markX;
        this.markO = !markX;
    }

    public boolean hasMarkX() {
        return this.markX;
    }

    public boolean hasMarkO() {
        return this.markO;
    }
}