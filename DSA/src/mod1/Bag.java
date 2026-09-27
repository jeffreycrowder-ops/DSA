package mod1;

import java.util.ArrayList;

// bag class that stores items and allows duplicates
public class Bag<T> {

    // internal list that holds all items in the bag
    private ArrayList<T> items;

    // constructor that creates an empty bag
    public Bag() {
        items = new ArrayList<>();
    }

    // adds an item to the bag
    public void add(T item) {
        items.add(item);
    }

    // removes one of the items from the bag
    public void remove(T item) {
        items.remove(item);
    }

    // checks to see if the item exists in the bag
    public boolean contains(T item) {
        return items.contains(item);
    }

    // counts how many times the item appears in the bag
    public int count(T item) {
        int counter = 0;
        // loops through all items and count any matches
        for (T element : items) {
            if (element.equals(item)) {
                counter++;
            }
        }
        return counter;
    }

    // returns the total number of items in the bag
    public int size() {
        return items.size();
    }

    // merges another bag into this bag
    public void merge(Bag<T> otherBag) {
        // add all items from the other bag into this one
        for (T element : otherBag.items) {
            items.add(element);
        }
    }

    // returns a new bag with only distinct items
    public Bag<T> distinct() {
        Bag<T> distinctBag = new Bag<>();
        // add each item only once
        for (T element : items) {
            if (!distinctBag.contains(element)) {
                distinctBag.add(element);
            }
        }
        return distinctBag;
    }

    // returns a readable version of the bag contents to print
    @Override
    public String toString() {
        return items.toString();
    }
}