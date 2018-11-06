package ru.job.tracker;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.lang.String;

public class StartUI {

    private Input input;
    private final Tracker tracker;
    private int[] ranges = new int[]{0, 1, 2, 3, 4};

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public StartUI(Tracker tracker) {
        this.tracker = tracker;
    }


    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        do {
            menu.show();
            menu.select(input.ask("select", ranges));
        } while (!"y".equals(this.input.ask("Exit?(y): ")));
    }

    /**
     * This method add a new item to the repository.
     */
    private void createItem() {
        System.out.println("------------ Add new item --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    /**
     * This method shows all items .
     */
    public void showAllItems() {
        System.out.println("------------ Show all items --------------");
        Item[] result = tracker.getAll();
        if (tracker.findAll().length == 0) {
            System.out.println("There is no items");
        }
        for (int index = 0; index < tracker.findAll().length; index++) {
            System.out.print("id: " + result[index].getId() + " Name: " + result[index].getName() +
                    " Description: " + result[index].getDescription()
                    + System.lineSeparator()
            );
        }
    }

    /**
     * This method shows the menu.
     */
    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Add new Item.");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println("Select:");
    }

    /**
     * This method edit item founded by id.
     */
    private void editItem() {
        System.out.println("------------ Edit item --------------");
        String itemId = this.input.ask("Enter an id of item u need to edit: ");
        String name = this.input.ask("Enter a name you need to change to :");
        String desc = this.input.ask("Enter a new description:");
        Item item = new Item(name, desc);
        if (tracker.findById(itemId) != null) {
            tracker.replace(itemId, item);
        } else {
            System.out.println("There is no item with this id");
        }

    }

    /**
     * This method delete item founded by id.
     */
    private void deleteItem() {
        System.out.println("------------ Delete item --------------");
        String itemId = this.input.ask("Enter id of item you want to delete: ");
        if (tracker.findById(itemId) != null) {
            tracker.delete(itemId);
        } else {
            System.out.println("There is no item with this id");
        }
    }

    /**
     * This method find item by id.
     */
    public void findById() {
        System.out.println("------------ Find item by id --------------");
        String itemId = this.input.ask("Enter id of item you want to find: ");
        if (tracker.findById(itemId) != null) {
            System.out.print("id: " + this.tracker.findById(itemId).getId() + " Name: " +
                    tracker.findById(itemId).getName() + " Description: " +
                    tracker.findById(itemId).getDescription() + "\n");
        } else {
            System.out.println("There is no item with this id");
        }
    }

    /**
     * This method find item by name.
     */
    private void findByName() {
        System.out.println("------------ Find item by name --------------");
        String itemName = this.input.ask("Enter name of item you want to find: ");
        if (tracker.findByName(itemName) != null) {
            System.out.print("id: " + tracker.findByName(itemName).getId() + " Name: " +
                    tracker.findByName(itemName).getName() + " Description: " +
                    tracker.findByName(itemName).getDescription() + "\n");
        } else {
            System.out.println("There is no item with this name");
        }

    }

    /**
     * Запускт программы.
     *
     * @param args
     */
    public static void main(String[] args) {

        new StartUI(new ValidateInput(), new Tracker()).init();
    }
}
