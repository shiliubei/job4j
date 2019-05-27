package ru.job.singleton;

/**
 * TrackerSingleTest
 *
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $Id$
 * @since 0.1
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerSingleTest {
    @Test
    public void firstAndSecondAreEqual() {
        TrackerSingle2 tracker1 = TrackerSingle2.getInstance();
        TrackerSingle2 tracker2 = TrackerSingle2.getInstance();
        assertThat(tracker1, is(tracker2));
    }
}