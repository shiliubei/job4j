package ru.job.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Tracker.
 *
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $0.1$
 * @since 06.09.18
 */
public class TreckerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription");
        tracker.add(item);
        assertThat(tracker.getAll()[0], is(item));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription");
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2");
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription");
        Item second = new Item("test2", "testDescription22");
        Item[] array = new Item[1];
        array[0] = second;
        tracker.add(first);
        tracker.add(second);
        tracker.delete(first.getId());
        assertThat(array, is(tracker.getAll()));
    }

    //findByName
    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription");
        Item second = new Item("test2", "testDescription22");
        tracker.add(first);
        tracker.add(second);
        assertThat(first, is(tracker.findByName(first.getName())));
    }

    @Test
    public void whenFindAllName() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription");
        Item second = new Item("test2", "testDescription22");
        Item[] array = new Item[2];
        array[0] = first;
        array[1] = second;
        tracker.add(first);
        tracker.add(second);
        assertThat(array, is(tracker.findAll()));
    }
}
