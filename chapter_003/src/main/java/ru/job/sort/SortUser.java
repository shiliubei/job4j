package ru.job.sort;

import java.util.*;

public class SortUser {

    public Set<User> sort(List<User> userList) {
        Collections.sort(userList);
        Set<User> userSet = new TreeSet<>(userList);
        return userSet;
    }
}
