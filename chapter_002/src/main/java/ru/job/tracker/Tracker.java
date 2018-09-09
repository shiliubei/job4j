package ru.job.tracker;


/**
 * Tracker class.
 *
 * @author Danil Liu (shiliubei@gmail.com)
 * @version $0.1$
 * @since 06.09.18
 */
public class Tracker {


    /**
     * Array of items.
     *
     * @return array of items.
     */
    private final Item[] items = new Item[100];
    private int position;
    public int id = 100;

    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Find item by item name.
     *
     * @param name String item's name.
     * @return item.
     */
    public Item findByName(String name) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getName().equals(name)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Add item to the array of items.
     *
     * @param item Item.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Add item to the array of items.
     *
     * @return array of items without null cells.
     */
    public Item[] getAll() {
        Item[] result = new Item[this.position];
        for (int index = 0; index < this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }

    /**
     * Add item to the array of items.
     *
     * @return array of items without null cells.
     */
    public Item[] findAll() {
        Item[] result = new Item[position];
        for (int index = 0; index < this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }

    /**
     * Method generates unic id.
     *
     * @return Absolutely unic id.
     */
    private String generateId() {
        return Integer.toString(++id);
    }

    /**
     * @return .
     */
    public void replace(String id, Item item) {
        for (int index = 0; index < this.position; index++) {
            if (items[index].getId().equals(id)) {
                items[index] = item;
                //items[index].setId(generateId());
                break;
            }
        }
    }

    public void delete(String id) {
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                items[index] = items[position];
                position--;
                System.arraycopy(items, index + 1, items, index, position);
            } else {
                items[index] = null;
            }
            break;
        }

    }
}

