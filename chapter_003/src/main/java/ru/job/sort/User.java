package ru.job.sort;

public class User implements Comparable<User>{

    private String name;
    private int age;

    public User(String name, int age) {
        super();
        this.name = name;
        this.age = age;
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
        return this.age > person.age ? 1 : this.age < person.age ? -1 : 0;
    }
}
