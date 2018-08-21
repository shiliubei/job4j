package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Board task.
 *
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $0.1$
 * @since 21.08.18
 */

public class BoardTest {
        @Test
        public void when3x3() {
            Board board = new Board();
            String rsl = board.paint(3, 3);
            String ln = System.lineSeparator();
            assertThat(rsl, is(
                    String.format("X X%s X %sX X%s", ln, ln, ln)
                    )
            );
        }

}
