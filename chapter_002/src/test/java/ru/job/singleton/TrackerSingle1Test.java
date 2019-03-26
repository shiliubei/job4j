package ru.job.singleton;

/**
 * TrackerSingleTest
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $Id$
 * @since 0.1
 */
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import ru.job.singleton.TrackerSingle1;

public class TrackerSingle1Test {
    @Test
    public void FirstAndSecondAreEqual() {
        TrackerSingle1 tracker1 = TrackerSingle1.INSTANCE;
        TrackerSingle1 tracker2 = TrackerSingle1.INSTANCE;
        assertThat(tracker1, is(tracker2));
    }
}