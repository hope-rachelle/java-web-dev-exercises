package exercises;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner input;
        double length;
        double width;
        input = new Scanner(System.in);
        System.out.println("Enter a length:");
        length = input.nextDouble();
        System.out.println("Enter a width");
        width = input.nextDouble();
        double area = length * width;
        System.out.println("The Area is " + area);
    }
}

