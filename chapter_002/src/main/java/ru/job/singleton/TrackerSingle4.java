package ru.job.singleton;
/**
 * TrackerSingle
 *
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $Id$
 * @since 0.1
 */
import ru.job.tracker.Item;

public class TrackerSingle4 {
    private TrackerSingle4() {
    }

    public static TrackerSingle4 getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerSingle4 INSTANCE = new TrackerSingle4();
    }

    public static void main(String[] args) {
        TrackerSingle4 tracker = TrackerSingle4.getInstance();
    }
}