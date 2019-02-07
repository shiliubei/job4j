package ru.job.tracker;

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private UserAction[] actions = new UserAction[6];

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    private class AddItem extends BaseAction {

        public AddItem() {
            super(0, "Add item");
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please, enter the name of the item");
            String desc = input.ask("Enter the description");
            tracker.add(new Item(name, desc));
        }
    }

    private class ShowAllItems extends BaseAction {

        public ShowAllItems() {
            super(1, "Show all");
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Show all items --------------");
            Item[] result = tracker.getAll();
            if (result.length == 0) {
                System.out.println("There is no items");
            } else {
                for (Item item : result) {
                    System.out.println(item);
                }
            }
        }
    }

    private class EditItemUseId extends BaseAction {
        public EditItemUseId() {
            super(2, "Edit item");
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Edit item --------------");
            String itemId = input.ask("Enter an item id u need to edit: ");
            String name = input.ask("Enter a name you need to change:");
            String desc = input.ask("Enter a new description:");
            Item item = new Item(name, desc);
            if (tracker.findById(itemId) != null) {
                tracker.replace(itemId, item);
            } else {
                System.out.println("There is no item with this id");
            }
        }
    }

    private class DeleteItem extends BaseAction {
        public DeleteItem() {
            super(3, "Delete item");
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Delete item --------------");
            String itemId = input.ask("Enter id of item you want to delete: ");
            if (tracker.findById(itemId) != null) {
                tracker.delete(itemId);
            } else {
                System.out.println("There is no item with this id");
            }
        }
    }

    private class FindById extends BaseAction {
        public FindById() {
            super(4, "Find by id");
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Find item by id --------------");
            String itemId = input.ask("Enter id of the item you wanna find: ");
            if (tracker.findById(itemId) != null) {
                System.out.print("id: " + tracker.findById(itemId).getId() + " Name: " +
                        tracker.findById(itemId).getName() + " Description: " +
                        tracker.findById(itemId).getDescription() + "\n");
            } else {
                System.out.println("There is no item with this id");
            }
        }
    }

    private class FindByName extends BaseAction {
        public FindByName() {
            super(5, "Find by name");
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Find item by name --------------");
            String itemName = input.ask("Enter name of item you want to find: ");
            if (tracker.findByName(itemName) != null) {
                System.out.print("id: " + tracker.findByName(itemName).getId() + " Name: " +
                        tracker.findByName(itemName).getName() + " Description: " +
                        tracker.findByName(itemName).getDescription() + "\n");
            } else {
                System.out.println("There is no item with this name");
            }
        }
    }

    public void fillActions() {
        this.actions[0] = new AddItem();
        this.actions[1] = new ShowAllItems();
        this.actions[2] = new EditItemUseId();
        this.actions[3] = new DeleteItem();
        this.actions[4] = new FindById();
        this.actions[5] = new FindByName();
    }

    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
}
