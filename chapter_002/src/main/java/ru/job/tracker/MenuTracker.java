package ru.job.tracker;

import java.util.ArrayList;
import java.util.List;

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private UserAction[] actions = new UserAction[1];

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }


    private class AddItem implements UserAction {
        public int key(){
            return 0;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please, enter the ");
            String desc = input.ask("First disc");
            tracker.add(new Item(name, desc));

        }
        public String info(){
            return " ";
        }
    }

    public int getActionsLentgh() {
        return this.actions.length;
    }

    public void fillActions() {
        this.actions[0]= new AddItem();
        /*this.actions[1] = new ShowItems();
        this.actions.add(new MenuTracker.EditItem(2, "Edit item"));
        this.actions.add(new MenuTracker.DeleteItem(3, "Delete item"));
        this.actions.add(new FindItemById(4, "Find item by Id"));
        this.actions.add(new FindItemsByName(5, "Find items by name"));
        this.actions.add(new ExitProgram(6, "Exit Program")); */
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
