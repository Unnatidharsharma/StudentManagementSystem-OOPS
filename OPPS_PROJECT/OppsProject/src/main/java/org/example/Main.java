package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.println("Enter student details (type 'done' to finish):");

        while (true) {
            System.out.print("\nEnter student type (regular/distance) or 'done' to stop: ");
            String type = sc.nextLine().trim().toLowerCase();

            if (type.equals("done")) {
                break;
            }

            if (!type.equals("regular") && !type.equals("distance")) {
                System.out.println("Invalid type! Please enter 'regular' or 'distance'.");
                continue;
            }

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter roll number: ");
            int rollNo;
            try {
                rollNo = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid roll number. Skipping entry.");
                continue;
            }

            System.out.print("Enter course: ");
            String course = sc.nextLine();

            if (type.equals("regular")) {
                students.add(new RegularStudent(name, rollNo, course));
            } else {
                students.add(new DistanceStudent(name, rollNo, course));
            }
        }

        System.out.println("\n---- Student Details ----");
        for (Student student : students) {
            student.displayDetails();
            System.out.println("-------------------------");
        }

        sc.close();
    }
}
