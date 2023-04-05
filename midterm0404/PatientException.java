
public class PatientException extends Exception {
    
  public PatientException() {
      super("PatientException");
  }
  
  public PatientException(String message) {
      super("PatientException"  + message);
  }
  
}
