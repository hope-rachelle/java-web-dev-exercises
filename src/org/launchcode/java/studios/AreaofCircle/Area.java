package org.launchcode.java.studios.AreaofCircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;
        Double radius;
        Double area;
        input = new Scanner(System.in);
        System.out.println("Enter a radius");
        radius = input.nextDouble();
        area = (radius * radius) * 3.14;
        while(radius <= 0) {
            System.out.println("Enter a positive number of radius:");
            radius = input.nextDouble();
            if (radius <= 0) {
                System.out.println("Enter a positive number of radius:");
                radius = input.nextDouble();
            }
        }
        System.out.println("The area of a circle with a radius of " + radius + " = " + area);
        System.out.println("The area of a circle with a radius of "  + radius + " = " + Circle.getArea(radius));
    }
}
