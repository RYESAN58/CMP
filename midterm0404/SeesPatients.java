
public interface SeesPatients {
  static final int MAX_PATIENTS = 100;
  
  void addPatient(Patient patient) throws PatientException;
  
  Patient[] getPatients();
  
  String getPatientsAsString();
  
  boolean isPatient(Patient patient);
}
