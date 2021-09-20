package exercises.technology.main;

import exercises.technology.main.Computer;

public class Laptop extends Computer {
    private double weight;

    public Laptop(int year, String make, boolean hasKeyboard, double weight) {
        super(year, make, hasKeyboard);
        this.weight = weight;
    }

    public boolean isClunky() {
        if (weight > 5.0) {
            return true;
        }
        else {
            return false;
        }
    }
}
