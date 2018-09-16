package ru.job.tracker;


public class StartUI {

    private static final String ADD = "0";
    private static final String SHOWALL = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FINDBYID = "4";
    private static final String FINDBYNAME = "5";
    private static final String EXIT = "6";
    private final Input input;
    private final Tracker tracker;


    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Enter the menu item : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOWALL.equals(answer)) {
                this.showAllItems();
            } else if (EDIT.equals(answer)) {
                this.editItem();
            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (FINDBYID.equals(answer)) {
                this.findById();
            } else if (FINDBYNAME.equals(answer)) {
                this.findByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }

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
    private void showAllItems() {
        System.out.println("------------ Show all items --------------");
        Item[] result = tracker.getAll();
        if (tracker.findAll().length == 0) {
            System.out.println("There is no items");
        }
        for (int index = 0; index < tracker.findAll().length; index++) {
            System.out.print("id: " + result[index].getId() + " Name: " + result[index].getName() +
                    " Description: " + result[index].getDescription() + "\n");
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
    private void findById() {
        System.out.println("------------ Find item by id --------------");
        String itemId = this.input.ask("Enter id of item you want to find: ");
        if (tracker.findById(itemId) != null) {
            System.out.print("id: " + tracker.findByName(itemId).getId() + " Name: " +
                    tracker.findByName(itemId).getName() + " Description: " +
                    tracker.findByName(itemId).getDescription() + "\n");
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
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}