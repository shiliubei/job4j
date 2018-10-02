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

    @Before
    public void first() {
        System.setOut(new PrintStream(out));
    }

    @After
    public void last() {
        System.setOut(stdout);
    }

    @Test
    public void whenTestUIShowAll() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test name", "desc");
        tracker.add(previous);
        Input input = new StubInput(new String[]{"1", "6"});
        new StartUI(input, tracker).showAllItems();
        assertThat(
                new String(out.toByteArray()), is(new StringBuilder()
                        .append("------------ Show all items --------------")
                        .append(System.lineSeparator())
                        .append("id: 101 Name: test name Description: desc" + "\r" + "\n")
                        .toString()
                )
        );
        System.setOut(stdout);
    }

    @Test
    public void whenTestUIFindById() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test name", "desc");
        tracker.add(previous);
        Input input = new StubInput(new String[]{"101", "6"});
        System.setOut(new PrintStream(out));
        new StartUI(input, tracker).findById();
        assertThat(
                new String(out.toByteArray()), is(new StringBuilder()
                        .append("------------ Find item by id --------------")
                        .append(System.lineSeparator())
                        .append("id: 101 Name: test name Description: desc" + "\n")
                        .toString()
                )
        );
    }

}
