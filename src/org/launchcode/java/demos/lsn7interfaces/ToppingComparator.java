package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ToppingComparator implements Comparator<Topping> {
    @Override
    public int compare(Topping topping1, Topping topping2) {
        return topping1.getName().compareTo(topping2.getName());
    }
}
