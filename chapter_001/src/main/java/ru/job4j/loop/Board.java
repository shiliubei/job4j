package ru.job4j.loop;
/**
 * Package for Board task.
 *
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $0.1$
 * @since 12.08.18
 */
public class Board {
    /**
     * paint a board in chess board style.
     * @param width  width of board.
     * @param height  height of board.
     * @return screen.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i <height; i++ ) {
            for (int j = 0; j <width; j++  ) {
                if ((i+j)%2==0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
