package org.launchcode.java.demos.lsn6inheritance;


public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());

        Cat cat1 = new Cat(8.6);
        HouseCat cat2 = new HouseCat("Cheshire", 12);
        System.out.println(cat1.noise());
        //cat2.setHungry(true);
        System.out.println(cat2.noise());

        Cat suki = new HouseCat("Suki", 8);
        System.out.println(suki.noise());
        suki.setHungry(true);
        System.out.println(((HouseCat)suki).isSatisfied());
        System.out.println(suki.noise());
    }
}
