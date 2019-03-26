package ru.job.singleton;

/**
 * TrackerSingleTest
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $Id$
 * @since 0.1
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerSingle3Test {
    @Test
    public void whenCreateFirstAndSecondBothHoveToBeEqual3() {
        TrackerSingle3 tracker1 =  TrackerSingle3.getInstance();
        TrackerSingle3 tracker2 =  TrackerSingle3.getInstance();
        assertThat(tracker1, is(tracker2));
    }
}