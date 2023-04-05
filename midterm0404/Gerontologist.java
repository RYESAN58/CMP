
public class Gerontologist extends Doctor {
  private boolean performsHouseCalls = true;
  private double visitFee = 0.0;

  public Gerontologist(String name) {
      super(name);
  }

  public Gerontologist(String name, boolean performsHouseCalls, double visitFee) {
      super(name);
      this.performsHouseCalls = performsHouseCalls;
      this.visitFee = visitFee;
  }

  public boolean performsHouseCalls() {
      return performsHouseCalls;
  }

  public double getVisitFee() {
      return visitFee;
  }

  public void setPerformsHouseCalls(boolean performsHouseCalls) {
      this.performsHouseCalls = performsHouseCalls;
  }

  public void setVisitFee(double visitFee) {
    if(visitFee < 0){
      this.visitFee = 0.0;
    }else{
      this.visitFee = visitFee;
    }
  }

  @Override
  public void addPatient(Patient patient) throws PatientException {
      if (2023 - patient.getBirthYear() < 65) {
          throw new PatientException("Gerontologists only accept patients who are 65 years or older");
      }
      super.addPatient(patient);
  }

  @Override
  public String toString() {
      return super.toString() + String.format("\nGerontologist: %s | visit fee=%02.2f", performsHouseCalls ? "performs house calls" : "no house calls", visitFee);
  }

  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (!(obj instanceof Gerontologist)) return false;

    Gerontologist other = (Gerontologist) obj;
    return super.equals(obj) &&
            this.performsHouseCalls == other.performsHouseCalls &&
            this.visitFee == other.visitFee;
          }
}
