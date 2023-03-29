
import java.util.Arrays;

public class Student extends Person implements Comparable<Person> {
    private static int numStudents = 0;
    private int studentID;
    private Course[] coursesTaken;
    private int numCoursesTaken;
    private boolean isGraduate;
    private String major;

    public Student() {
        super();
        coursesTaken = new Course[50];
        numCoursesTaken = 0;
        isGraduate = false;
        major = "undeclared";
        studentID = ++numStudents;
    }

    public Student(boolean isGraduate) {
        super();
        coursesTaken = new Course[50];
        numCoursesTaken = 0;
        this.isGraduate = isGraduate;
        major = "undeclared";
        studentID = ++numStudents;
    }

    public Student(String major, boolean isGraduate) {
        super();
        coursesTaken = new Course[50];
        numCoursesTaken = 0;
        this.isGraduate = isGraduate;
        this.major = major;
        studentID = ++numStudents;
    }

    public Student(String name, int birthYear, String major, boolean isGraduate) {
        super(name, birthYear);
        coursesTaken = new Course[50];
        numCoursesTaken = 0;
        this.isGraduate = isGraduate;
        this.major = major;
        studentID = ++numStudents;
    }

    public boolean isGraduate() {
        return isGraduate;
    }

    public int getNumCoursesTaken() {
        return numCoursesTaken;
    }

    public static int getNumStudents() {
        return numStudents;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setIsGraduate(boolean isGraduate) {
        this.isGraduate = isGraduate;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void addCourseTaken(Course course) {
        if (numCoursesTaken < coursesTaken.length) {
            coursesTaken[numCoursesTaken++] = course;
        }
    }

    public void addCoursesTaken(Course[] courses) {
        for (Course course : courses) {
            addCourseTaken(course);
        }
    }

    public Course getCourseTaken(int index) {
        if (index >= 0 && index < numCoursesTaken) {
            return coursesTaken[index];
        } else {
            return null;
        }
    }

    public String getCourseTakenAsString(int index) {
        Course course = getCourseTaken(index);
        if (course != null) {
            return course.getCourseDept() + "-" + course.getCourseNum();
        } else {
            return "";
        }
    }

    public String getAllCoursesTakenAsString() {
        String result = "";
        for (int i = 0; i < numCoursesTaken; i++) {
            result += getCourseTakenAsString(i);
            if (i < numCoursesTaken - 1) {
                result += ", ";
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student other = (Student) obj;
            return super.equals(other) &&
                   Arrays.equals(coursesTaken, other.coursesTaken) &&
                   numCoursesTaken == other.numCoursesTaken &&
                   isGraduate == other.isGraduate &&
                   major.equals(other.major) &&
                   studentID == other.studentID;
        } else {
            return false;
        }
    }

    public String toString() {
      return String.format("%s Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s",
          super.toString(), studentID, major, isGraduate ? "Graduate" : "Undergraduate", numCoursesTaken, getAllCoursesTakenAsString());
  }

  public int compareTo(Person p) {
      if (p instanceof Student) {
          Student s = (Student) p;
          return this.numCoursesTaken - s.numCoursesTaken;
      } else {
          return super.compareTo(p);
      }
  }

  }
