package ru.job.tracker;

public class Item {
    private String id;
    public String name;
    public String description;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{" + "id='" + id + '\''
                + ", name='" + name + '\''
                + ", description='"
                + description + '\''
                + '}';
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
