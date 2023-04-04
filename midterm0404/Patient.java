
public class Patient {
  private static int numPatients = 0;
  private String name;
  private int birthYear;
  private int patientNumber;
  private String ailment;

  public Patient(String name, int birthYear, String ailment) {
      this.name = name;
      this.birthYear = birthYear;
      this.ailment = ailment;
      numPatients++;
      this.patientNumber = numPatients;
  }

  public String getName() {
      return name;
  }

  public int getBirthYear() {
      return birthYear;
  }

  public int getPatientNumber() {
      return patientNumber;
  }

  public String getAilment() {
      return ailment;
  }

  public String toString() {
      return String.format("Patient [name=%20s | birthYear=%04d | patient number=%06d | ailment=%20s]\n", name, birthYear, patientNumber, ailment);
  }

  public boolean equals(Object obj) {
      if (obj == this) {
          return true;
      }
      if (!(obj instanceof Patient)) {
          return false;
      }
      Patient other = (Patient) obj;
      return this.patientNumber == other.patientNumber;
  }
}

