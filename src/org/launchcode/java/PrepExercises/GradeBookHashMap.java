package org.launchcode.java.PrepExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by LaunchCode
 */
public class GradeBookHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer newStudentID;

        System.out.println("Enter your students ID number (or 0 to finish):");

        // Get student names and grades
        do {

            System.out.print("ID: ");
            newStudentID = in.nextInt();

            if (!newStudentID.equals(0)) {
                System.out.print("Name: ");
                String newName = in.nextLine();
                students.put(newStudentID, newName);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while (newStudentID != 0);

        // Print class roster
        System.out.println("\nClass roster:");


        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }

    }
}