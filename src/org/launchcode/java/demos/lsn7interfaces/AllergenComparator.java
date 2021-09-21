package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class AllergenComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor flavor1, Flavor flavor2) {
        if (flavor1.getAllergens().size() > flavor2.getAllergens().size()){
            return 1;
        } else if (flavor1.getAllergens().size() < flavor2.getAllergens().size()){
            return -1;
        } else {
            return 0;
        }
    }
}
