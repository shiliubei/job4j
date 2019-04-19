package ru.job.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static javax.swing.UIManager.get;

public class UserConvert {
    HashMap<Integer, User> users = new HashMap<>();

    public HashMap<Integer, User> process(List<User> list) {

        for (User i : list) {
            users.put(i.getId(), i);
        }

        return users;
    }
}
