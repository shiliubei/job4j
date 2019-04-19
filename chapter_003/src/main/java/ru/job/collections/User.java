package ru.job.collections;

public class User {


    private Integer id;
    private String name;
    private String city;

    public User(Integer id, String name, String city){
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }
}
