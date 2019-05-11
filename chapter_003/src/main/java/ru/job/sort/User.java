package ru.job.sort;

import java.util.Comparator;

public class User implements Comparable<User> {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }



    class SortByAge implements Comparator<User>{
        public int compare(User a, User b){
            return a.age - b.age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(User person) {

        return Integer.compare(this.age, person.age);
    }
}
