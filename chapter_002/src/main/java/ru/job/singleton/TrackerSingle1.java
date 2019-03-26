package ru.job.singleton;
/**
 * TrackerSingle
 *
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $Id$
 * @since 0.1
 */
import ru.job.tracker.Item;

public enum TrackerSingle1 {
    INSTANCE;

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingle1 tracker = TrackerSingle1.INSTANCE;
    }
}
