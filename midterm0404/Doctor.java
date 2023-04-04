
import java.util.Arrays;

public class Doctor implements SeesPatients, Comparable<Doctor> {
    private static int numDoctors = 0;
    private  int licenseNumber;
    private String name;
    private Patient[] patients;
    private int numberOfPatients;

    public Doctor(String name) {
        numDoctors++;
        this.licenseNumber = numDoctors;
        this.name = name;
        this.patients = new Patient[MAX_PATIENTS];
        this.numberOfPatients = 0;
    }

    public static int getNumDoctors() {
        return numDoctors;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    @Override
    public Patient[] getPatients() {
        return Arrays.copyOf(patients, numberOfPatients);
    }

    @Override
    public String getPatientsAsString() {
        StringBuilder sb = new StringBuilder("patients=");
        for (int i = 0; i < numberOfPatients; i++) {
            sb.append(patients[i].toString());
            if (i < numberOfPatients - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    @Override
    public boolean isPatient(Patient patient) {
        for (int i = 0; i < numberOfPatients; i++) {
            if (patients[i].equals(patient)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addPatient(Patient p) throws PatientException {
      try {
          for (int i = 0; i < patients.length; i++) {
              if (patients[i] == null) {
                  patients[i] = p;
                  return;
              }
          }
          throw new PatientException("Array capacity has been reached.");
      } catch (ArrayIndexOutOfBoundsException e) {
          throw new PatientException("Array capacity has been reached.");
      }
  }
    @Override
    public String toString() {
        return String.format("Doctor: name=%20s | license number=%06d | %s", name, licenseNumber, getPatientsAsString());
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Doctor)) {
            return false;
        }
        Doctor other = (Doctor) o;
        return name.equals(other.getName()) && numberOfPatients == other.getNumberOfPatients();
    }

    @Override
    public int compareTo(Doctor other) {
        return numberOfPatients - other.getNumberOfPatients();
    }
}

