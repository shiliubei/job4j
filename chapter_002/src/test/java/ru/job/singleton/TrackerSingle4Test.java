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

public class TrackerSingle4Test {
    @Test
    public void whenCreateFirstAndSecondBothHoveToBeEqual4() {
        TrackerSingle4 tracker1 =  TrackerSingle4.getInstance();
        TrackerSingle4 tracker2 =  TrackerSingle4.getInstance();
        assertThat(tracker1, is(tracker2));
    }
}