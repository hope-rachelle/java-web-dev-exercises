package exercises;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input;
        double miles;
        double gallons;
        input = new Scanner(System.in);
        System.out.println("How many miles did you drive:");
        miles = input.nextDouble();
        System.out.println("How many Gallons did you use");
        gallons = input.nextDouble();
        double mpg = miles / gallons;
        System.out.println("Your gas mileage for this trip was " + mpg);
    }
}