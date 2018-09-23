package ru.job.tracker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    PrintStream stdout = System.out;
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    Tracker tracker = new Tracker();
    @Before
    public void first() {
        System.setOut(new PrintStream(out));
    }
    @After
    public void last(){
        System.setOut(stdout);
    }

    @Test
    public void whenTestUIShowAll() {
        Item previous = new Item("test name", "desc");
        tracker.add(previous);
        new StartUI(tracker).showAllItems();
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("------------ Show all items --------------")
                                .append(System.lineSeparator())
                                .append("id: 101 Name: test name Description: desc")
                                .toString()
                )
        );
        this.last();
    }

}
