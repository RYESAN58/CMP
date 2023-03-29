public class GeneralStaff extends Employee implements Comparable<Person>  {
  private String duty;

  public GeneralStaff() {
      super();
      duty = "";
  }

  public GeneralStaff(String duty) {
      super();
      this.duty = duty;
  }

  public GeneralStaff(String deptName, String duty) {
      super(deptName);
      this.duty = duty;
  }

  public GeneralStaff(String name, int birthYear, String deptName, String duty) {
      super(name, birthYear, deptName);
      this.duty = duty;
  }

  public String getDuty() {
      return duty;
  }

  @Override
  public boolean equals(Object obj) {
      if (!super.equals(obj)) {
          return false;
      }

      if (obj instanceof GeneralStaff) {
          GeneralStaff staff = (GeneralStaff) obj;
          return duty.equals(staff.getDuty());
      }

      return false;
  }

  @Override
  public String toString() {
      return super.toString() + " GeneralStaff: Duty: " + duty;
  }
}
