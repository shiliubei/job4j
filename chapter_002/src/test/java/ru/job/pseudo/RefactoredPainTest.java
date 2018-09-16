package ru.job.pseudo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class RefactoredPainTest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
        assertThat(
                new String(this.out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("\n" + "++++")
                                .append("\n" + "+  +")
                                .append("\n" + "+  +")
                                .append("\n" + "++++")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }

    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        assertThat(
                new String(this.out.toByteArray()),
                is(
                        new StringBuilder()

                                .append("\n" + "  +  ")
                                .append("\n" + " + + ")
                                .append("\n" + "+   +")
                                .append("\n" + "+++++")
                                .append(System.lineSeparator())
                                .toString()


                )
        );
    }

}
