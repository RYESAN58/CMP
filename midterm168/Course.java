package midterm168;

public class Course implements Comparable<Course> {
  private boolean isGraduateCourse;
  private int courseNum;
  private String courseDept;
  private int numCredits;

  public Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {
      this.isGraduateCourse = isGraduateCourse;
      this.courseNum = courseNum;
      this.courseDept = courseDept;
      this.numCredits = numCredits;
  }

  public boolean isGraduateCourse() {
      return isGraduateCourse;
  }

  public int getCourseNum() {
      return courseNum;
  }

  public String getCourseDept() {
      return courseDept;
  }

  public int getNumCredits() {
      return numCredits;
  }

  public String getCourseName() {
      String prefix = isGraduateCourse ? "G" : "U";
      return prefix + courseDept + courseNum;
  }

  @Override
  public boolean equals(Object obj) {
      if (obj == this) {
          return true;
      }
      if (!(obj instanceof Course)) {
          return false;
      }
      Course other = (Course) obj;
      return this.isGraduateCourse == other.isGraduateCourse
          && this.courseNum == other.courseNum
          && this.courseDept.equals(other.courseDept)
          && this.numCredits == other.numCredits;
  }

  @Override
  public String toString() {
      return String.format("Course: %3s-%3d | Number of Credits: %02d | Graduate/Undergraduate: %s", 
          courseDept, courseNum, numCredits, isGraduateCourse ? "Graduate" : "Undergraduate");
  }

  @Override
  public int compareTo(Course c) {
      return this.courseNum - c.courseNum;
  }
}
