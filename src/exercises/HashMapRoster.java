package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapRoster {
    public static void main(String[] args) {
        HashMap<Double, String > students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Double studentId;
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        do {
            System.out.print("Student ID#: ");
            studentId = input.nextDouble();

            if(!studentId.equals("")){
                System.out.print("Student Name: ");
                newStudent = input.nextLine();
                students.put(studentId, newStudent);

                input.nextLine();
        }

    } while(!studentId.equals(""));
        //input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Double, String> student : students.entrySet()) {
        System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}

