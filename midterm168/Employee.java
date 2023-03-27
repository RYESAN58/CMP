package midterm168;

public class Employee extends Person implements Comparable<Person> {
  private String deptName;
  private int employeeID;
  private static int numEmployees = 0;

  public Employee() {
      super();
      this.deptName = "";
      this.employeeID = ++numEmployees;
  }

  public Employee(String deptName) {
      super();
      this.deptName = deptName;
      this.employeeID = ++numEmployees;
  }

  public Employee(String name, int birthYear, String deptName) {
      super(name, birthYear);
      this.deptName = deptName;
      this.employeeID = ++numEmployees;
  }

  public String getDeptName() {
      return deptName;
  }

  public static int getNumEmployees() {
      return numEmployees;
  }

  public int getEmployeeID() {
      return employeeID;
  }

  public void setDeptName(String deptName) {
      this.deptName = deptName;
  }

  @Override
  public boolean equals(Object obj) {
      if (!super.equals(obj)) {
          return false;
      }
      if (!(obj instanceof Employee)) {
          return false;
      }
      Employee other = (Employee) obj;
      return this.deptName.equals(other.deptName)
          && this.employeeID == other.employeeID;
  }

  @Override
  public String toString() {
      return super.toString() + String.format(" Employee: Department: %20s | Employee Number: %3d", deptName, employeeID);
  }

  @Override
  public int compareTo(Person p) {
      if (!(p instanceof Employee)) {
          throw new IllegalArgumentException("Cannot compare Employee to non-Employee");
      }
      Employee other = (Employee) p;
      return this.employeeID - other.employeeID;
  }
}

