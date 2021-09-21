package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();
        //Comparator comparator = new FlavorComparator();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        //flavors.sort(comparator);
        flavors.sort(new FlavorComparator());
        System.out.println("Flavors:");
        for(Flavor flavor : flavors){
        System.out.println(flavor.getName());}

        flavors.sort(new AllergenComparator());
        System.out.println("\nAllergens:");
        for(Flavor flavor : flavors){
            System.out.println(flavor.getName() + ": " + flavor.getAllergens());
        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        cones.sort(new ConeComparator());
        System.out.println("\nCone Options:");
        for(Cone cone : cones){
            System.out.println(cone.getName() + ": $" + cone.getCost());
        }

        // Bonus: Topping class and comparator
        toppings.sort(new ToppingComparator());
        System.out.println("\nTopping Options:");
        for(Topping topping : toppings){
            System.out.println(topping.getName());
        }
    }
}
