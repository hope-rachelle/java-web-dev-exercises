package exercises.technology.main;

import exercises.technology.main.Computer;

public class SmartPhone extends Computer {

    private int numberOfSelfies;

    public SmartPhone(int year, String make, boolean hasKeyboard, int numberOfSelfies) {
        super(year, make, hasKeyboard);
        this.numberOfSelfies = numberOfSelfies;
    }

    public void takeSelfie(int picsTaken) {
        this.numberOfSelfies = this.numberOfSelfies + picsTaken;
    }

    public int getNumberOfSelfies() {
        return this.numberOfSelfies;
    }
}
