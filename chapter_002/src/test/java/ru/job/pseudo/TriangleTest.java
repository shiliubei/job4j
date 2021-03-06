package ru.job.pseudo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Danil Liu
 * @version $Id$
 * @since 0.1
 */
public class TriangleTest {
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
                is(
                        new StringBuilder()
                                .append("\n" + "  +  ")
                                .append("\n" + " + + ")
                                .append("\n" + "+   +")
                                .append("\n" + "+++++")
                                .toString()
                )
        );
    }
}
