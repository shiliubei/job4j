package ru.job.sort;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortUserTest {
    @Test
    public void WhetSortListToSet() {
        User user1 = new User("r2d2", 155);
        User user2 = new User("Corshun", 11);
        User user3 = new User("Sula", 45);
        SortUser sortUser = new SortUser();
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        Set<User> result = sortUser.sort(list);
        Set<User> userSet = new TreeSet<>();
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        assertThat(result, is(userSet));
    }

}
