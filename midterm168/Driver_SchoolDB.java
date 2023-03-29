
import java.util.Scanner;

public class Driver_SchoolDB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // create 3 Course objects based on user input
        Course[] courses = new Course[3];
        for (int i = 0; i < courses.length; i++) {
            Boolean isGraduateCourse = scanner.nextBoolean();
            int courseNum = scanner.nextInt();
            String courseDept = scanner.nextLine();
            scanner.nextLine();
            int numCredits = scanner.nextInt();
            courses[i] = new Course(isGraduateCourse, courseNum, courseDept, numCredits);
          }

        // // create 3 Faculty objects based on user input
        // Faculty[] faculties = new Faculty[3];
        // for (int i = 0; i < faculties.length; i++) {
        //     System.out.print("Enter faculty name: ");
        //     String name = scanner.nextLine();
        //     System.out.print("Enter faculty birth year: ");
        //     int birthYear = scanner.nextInt();
        //     scanner.nextLine(); // consume newline
        //     System.out.print("Enter faculty department: ");
        //     String department = scanner.nextLine();
        //     // faculties[i] = new Faculty(name, birthYear, department);
        // }

        // // create 3 GeneralStaff objects based on user input
        // GeneralStaff[] generalStaffs = new GeneralStaff[3];
        // for (int i = 0; i < generalStaffs.length; i++) {
        //     System.out.print("Enter general staff name: ");
        //     String name = scanner.nextLine();
        //     System.out.print("Enter general staff birth year: ");
        //     int birthYear = scanner.nextInt();
        //     scanner.nextLine(); // consume newline
        //     System.out.print("Enter general staff role: ");
        //     String role = scanner.nextLine();
        //     // generalStaffs[i] = new GeneralStaff(name, birthYear, role);
        // }

        // // create 3 Student objects based on user input
        // Student[] students = new Student[3];
        // for (int i = 0; i < students.length; i++) {
        //     System.out.print("Enter student name: ");
        //     String name = scanner.nextLine();
        //     System.out.print("Enter student birth year: ");
        //     int birthYear = scanner.nextInt();
        //     scanner.nextLine(); // consume newline
        //     System.out.print("Enter student major: ");
        //     String major = scanner.nextLine();
        //     students[i] = new Student(name, birthYear, major, false);
        // }

        // // add 2 new Courses to a Faculty object
        // faculties[0].addCourseTaught(courses[0]);
        // faculties[0].addCourseTaught(courses[1]);

        // // add 2 new Courses to a Student object
        // students[0].addCourseTaken(courses[1]);
        // students[0].addCourseTaken(courses[2]);

        // // add an array of 2 Courses to a Faculty object
        // Course[] facultyCourses = new Course[] {courses[1], courses[2]};
        // // faculties[1].set(facultyCourses);

        // // add an array of 2 Courses to a Student object
        // Course[] studentCourses = new Course[] {courses[0], courses[2]};
        // // students[1].setCoursesTaken(studentCourses);

        // // get the Course at index (valid and invalid indexes) from a Faculty object
        // System.out.print("Enter index to get course from faculty (valid index): ");
        // int validIndex = scanner.nextInt();
        // scanner.nextLine(); // consume newline
        // System.out.println("");
      }
    }