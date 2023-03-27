package midterm168;

import java.util.Scanner;

public class Driver_SchoolDB {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create 3 new Course objects based on input
        System.out.println("Enter information for three courses:");
        Course[] courses = new Course[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Course " + (i+1) + " code: ");
            String code = input.nextLine();
            System.out.print("Course " + (i+1) + " name: ");
            String name = input.nextLine();
            System.out.print("Course " + (i+1) + " credits: ");
            int credits = input.nextInt();
            input.nextLine(); // consume newline character
            // courses[i] = new Course(code, name, credits);
        }

        // Create 3 new Faculty objects based on input
        System.out.println("\nEnter information for three faculty members:");
        Faculty[] faculty = new Faculty[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Faculty " + (i+1) + " name: ");
            String name = input.nextLine();
            System.out.print("Faculty " + (i+1) + " birth year: ");
            int birthYear = input.nextInt();
            input.nextLine(); // consume newline character
            System.out.print("Faculty " + (i+1) + " department: ");
            String department = input.nextLine();
            System.out.print("Faculty " + (i+1) + " hire year: ");
            int hireYear = input.nextInt();
            input.nextLine(); // consume newline character
            // faculty[i] = new Faculty(name, birthYear, department, hireYear);
        }

        // Create 3 new GeneralStaff objects based on input
        System.out.println("\nEnter information for three general staff members:");
        GeneralStaff[] staff = new GeneralStaff[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("General staff " + (i+1) + " name: ");
            String name = input.nextLine();
            System.out.print("General staff " + (i+1) + " birth year: ");
            int birthYear = input.nextInt();
            input.nextLine(); // consume newline character
            System.out.print("General staff " + (i+1) + " department: ");
            String department = input.nextLine();
            System.out.print("General staff " + (i+1) + " hire year: ");
            int hireYear = input.nextInt();
            input.nextLine(); // consume newline character
            // staff[i] = new GeneralStaff(name, birthYear, department, hireYear);
        }

        // Create 3 new Student objects based on input
        System.out.println("\nEnter information for three students:");
        Student[] students = new Student[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Student " + (i+1) + " name: ");
            String name = input.nextLine();
            System.out.print("Student " + (i+1) + " birth year: ");
            int birthYear = input.nextInt();
            input.nextLine(); // consume newline character
            System.out.print("Student " + (i+1) + " major: ");
            String major = input.nextLine();
            System.out.print("Is student " + (i+1) + " a graduate student? (true/false): ");
            boolean isGraduate = input.nextBoolean();
            input.nextLine(); //
        }
      }
    }

