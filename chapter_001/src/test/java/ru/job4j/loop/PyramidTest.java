package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test for Painting pyramid.
 *
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $0.1$
 * @since 12.08.18
 */
public class PyramidTest {
    @Test
    public void whenPyramid4Left() {
        Pyramid paint = new Pyramid();
        String rst = paint.pyramid(4);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^   ")
                                .add("  ^^^  ")
                                .add(" ^^^^^ ")
                                .add("^^^^^^^")
                                .toString()
                )
        );
    }
}
