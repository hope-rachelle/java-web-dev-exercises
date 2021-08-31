package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapRoster {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer studentId;
        String newStudent;

        System.out.println("Enter your students (or ENTER 0 to finish):");

        do {
            System.out.print("Student ID#: ");
            studentId = input.nextInt();

            input.nextLine();

            if(!studentId.equals(0)){
                System.out.print("Student Name: ");
                newStudent = input.nextLine();
                students.put(studentId, newStudent);
        }

    } while(!studentId.equals(0));
        //input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
        System.out.println(student.getKey() + " : " + student.getValue());
        }
    }
}

