package ru.job.sort;

import java.util.*;

public class SortUser {

    public Set<User> sort(List<User> userList) {
        Set<User> userSet = new TreeSet<>(userList);
        return userSet;
    }

    /**
     * Used for sorting in ascending order of User name
     *
     * @param userList
     * @return userList.
     */
    public List<User> sortNameLength(List<User> userList) {
        userList.sort(new SortByName());
        return userList;
    }

    public List<User> sortByAllFields(List<User> userList) {
        userList.sort(new UserSortingComparator());
        return userList;
    }


}

class UserSortingComparator implements Comparator<User> {

    @Override
    public int compare(User a, User b) {

        int nameCompare = a.getName().compareTo(b.getName());
        int ageCompare = a.getAge() - b.getAge();

        if (nameCompare == 0) {
            return ((ageCompare == 0) ? nameCompare : ageCompare);
        } else {
            return nameCompare;
        }
    }
}

class SortByName implements Comparator<User> {

    public int compare(User a, User b) {
        return a.getName().compareTo(b.getName());
    }
}

class SortByAge implements Comparator<User> {
    public int compare(User a, User b) {
        return a.getAge() - b.getAge();
    }
}

