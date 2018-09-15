package ru.job.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test Trecker User activity.
 *
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $0.1$
 * @since 15.09.18
 */
public class StubInputTest {

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("test name"));
    }
    @Test
    public void whenUserAddTwoFindAll() {
        Tracker tracker = new Tracker();
        Tracker tracker2 = new Tracker();
        Input input = new StubInput(new String[]{"0", "1", "1","6"});
        Item first = new Item("1", "1");
        tracker2.add(first);
        new StartUI(input, tracker).init();
        assertThat(tracker.findById("101").getName(), is(tracker2.findById("101").getName()));
    }
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc"));
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }
    @Test
    public void whenUserAddTwoAndDeleteOneItem() {
        Tracker tracker = new Tracker();
        Tracker tracker2 = new Tracker();
        Input input = new StubInput(new String[]{"0", "1", "1","0", "w", "w","3","101","6"});
        //Item[] array = new Item[1];
        Item first = new Item("w", "w");
        tracker2.add(first);
        new StartUI(input, tracker).init();
        assertThat(tracker.findById("102").getName(), is("w"));
    }
    @Test
    public void whenUserAddItemThenFindById() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getId(), is("101"));
    }
    @Test
    public void whenUserAddItemThenFindByName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("test name"));
    }

}
