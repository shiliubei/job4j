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
    public int compare(User user1, User user2) {

        int NameCompare = user1.getName().compareTo(user2.getName());
        int AgeCompare = user1.getAge() - user2.getAge();

        if (NameCompare == 0) {
            return ((AgeCompare == 0) ? NameCompare : AgeCompare);
        } else {
            return NameCompare;
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

