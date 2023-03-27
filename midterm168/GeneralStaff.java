package midterm168;

public class GeneralStaff extends Employee {
  private String duty;

  public GeneralStaff() {
      this.duty = "";
  }

  public GeneralStaff(String duty) {
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
      
      if (!(obj instanceof GeneralStaff)) {
          return false;
      }
      
      GeneralStaff staff = (GeneralStaff) obj;
      return this.duty.equals(staff.getDuty());
  }

  @Override
  public String toString() {
      return super.toString() + String.format("GeneralStaff: Duty: %10s", duty);
  }
}

