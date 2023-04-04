
public class Pediatrician extends Doctor {
  private boolean hasPrivatePractice = false;
  private String hospitalName = "";

  public Pediatrician(String name) {
      super(name);
  }

  public Pediatrician(String name, boolean hasPrivatePractice, String hospitalName) {
      super(name);
      this.hasPrivatePractice = hasPrivatePractice;
      this.hospitalName = hospitalName;
  }

  public boolean hasPrivatePractice() {
      return hasPrivatePractice;
  }

  public String getHospitalName() {
      return hospitalName;
  }

  public void setHospitalName(String hospitalName) {
      this.hospitalName = hospitalName;
  }

  @Override
  public void addPatient(Patient patient) throws PatientException {
      if (patient.getBirthYear() > 2005) {
          super.addPatient(patient);
      } else {
          throw new PatientException("Pediatricians can only accept patients under 18 years old.");
      }
  }

  @Override
  public String toString() {
      return super.toString() + "\nPediatrician: has private practice=" + hasPrivatePractice 
              + " | hospital name=" + hospitalName;
  }

  @Override
  public boolean equals(Object obj) {
      if (obj instanceof Pediatrician) {
          Pediatrician other = (Pediatrician) obj;
          return super.equals(other) && hasPrivatePractice == other.hasPrivatePractice 
                  && hospitalName.equals(other.hospitalName);
      }
      return false;
  }
}
