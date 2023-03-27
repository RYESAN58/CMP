package midterm168;

public class Faculty extends Employee implements Comparable<Person> {
    private Course[] coursesTaught;
    private int numCoursesTaught;
    private boolean isTenured;

    public Faculty() {
        this.coursesTaught = new Course[100];
        this.numCoursesTaught = 0;
        this.isTenured = false;
    }

    public Faculty(boolean isTenured) {
        this.coursesTaught = new Course[100];
        this.numCoursesTaught = 0;
        this.isTenured = isTenured;
    }

    public Faculty(String deptName, boolean isTenured) {
        super(deptName);
        this.coursesTaught = new Course[100];
        this.numCoursesTaught = 0;
        this.isTenured = isTenured;
    }

    public Faculty(String name, int birthYear, String deptName, boolean isTenured) {
        super(name, birthYear, deptName);
        this.coursesTaught = new Course[100];
        this.numCoursesTaught = 0;
        this.isTenured = isTenured;
    }

    public boolean isTenured() {
        return isTenured;
    }

    public int getNumCoursesTaught() {
        return numCoursesTaught;
    }

    public void setIsTenured(boolean isTenured) {
        this.isTenured = isTenured;
    }

    public void addCourseTaught(Course course) {
        coursesTaught[numCoursesTaught++] = course;
    }

    public void addCoursesTaught(Course[] courses) {
        for (Course course : courses) {
            coursesTaught[numCoursesTaught++] = course;
        }
    }

    public Course getCourseTaught(int index) {
        if (index >= 0 && index < numCoursesTaught) {
            return coursesTaught[index];
        }
        return null;
    }

    public String getCourseTaughtAsString(int index) {
        if (index >= 0 && index < numCoursesTaught) {
            return coursesTaught[index].getCourseDept() + "-" + coursesTaught[index].getCourseNum();
        }
        return "";
    }

    public String getAllCoursesTaughtAsString() {
        String result = "";
        for (int i = 0; i < numCoursesTaught; i++) {
            result += getCourseTaughtAsString(i);
            if (i < numCoursesTaught - 1) {
                result += ", ";
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof Faculty)) {
            return false;
        }
        Faculty other = (Faculty) obj;
        if (this.numCoursesTaught != other.numCoursesTaught) {
            return false;
        }
        if (this.isTenured != other.isTenured) {
            return false;
        }
        for (int i = 0; i < this.numCoursesTaught; i++) {
            if (!this.coursesTaught[i].equals(other.coursesTaught[i])) {
                return false;
            }
        }
        return true;
    }


    @Override
    public String toString() {
        return super.toString() + String.format(" Faculty: %-11s | Number of Courses Taught: %3d | " +
                "Courses Taught: %s", isTenured ? "Tenured" : "Not Tenured", numCoursesTaught, getAllCoursesTaughtAsString());
    }

    @Override
    public int compareTo(Person p) {
        if (p instanceof Faculty) {
            Faculty other = (Faculty) p;
            return Integer.compare(this.numCoursesTaught, other.numCoursesTaught);
        }
        return super.compareTo(p);
    }
}
