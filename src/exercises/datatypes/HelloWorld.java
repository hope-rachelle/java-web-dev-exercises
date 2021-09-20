package exercises.datatypes;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, What is your name:");
        String name = input.nextLine();
        System.out.println("Hello " + name);
        do {


            System.out.println("Hello world!");


        } while (3 < 2);
    }
}
