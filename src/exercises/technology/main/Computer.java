package exercises.technology.main;

import exercises.technology.main.AbstractEntity;

public class Computer extends AbstractEntity {
    private int year;
    private String make;
    private boolean hasKeyboard;

    public Computer(int year, String make, boolean hasKeyboard) {
        this.year = year;
        this.make = make;
        this.hasKeyboard = hasKeyboard;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public boolean isHasKeyboard() {
        return hasKeyboard;
    }

    public String needsUpdate() {
        if (year < 2020) {
            return "Update Needed!!!";
        } else {
            return "Product is up to date.";
        }
    }

    public String needsCharging(int batteryLife) {
        if (batteryLife < 20) {
            return "Low Battery, Plug in soon.";
        } else {
            return "Battery life is Sufficient.";
        }
    }
}
