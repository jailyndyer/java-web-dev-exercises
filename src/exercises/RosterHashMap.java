package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RosterHashMap {
    public static void main(String[] args) {

        HashMap<String, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentID;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student ID: ");
            studentID = input.nextLine();

             System.out.print("Student Name: ");
             String studentName = input.nextLine();
             students.put(studentID, studentName);

             // Read in the newline before looping back

        } while (!studentID.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<String, String> student : students.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }
    }
}
