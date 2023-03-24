public class Infant extends Passenger implements Mover {

  private int numDiapers;

  public Infant() {
      super();
      numDiapers = 0;
  }

  public Infant(int numDiapers) {
      super();
      setNumDiapers(numDiapers);
  }

  public Infant(String name, int birthYear, double weight, double height, char gender, int numCarryOn, int numDiapers) {
      super(name, birthYear, weight, height, gender, numCarryOn);
      setNumDiapers(numDiapers);
  }

  public void setNumDiapers(int numDiapers) {
      if (numDiapers < 0) {
          this.numDiapers = 0;
      } else {
          this.numDiapers = numDiapers;
      }
  }

  public int getNumDiapers() {
      return numDiapers;
  }

  @Override
  public void printDetails() {
      super.printDetails();
      System.out.printf("Infant: Number of Diapers: %4d\n", numDiapers);
  }

  @Override
  public String toString() {
      return super.toString() + String.format("Infant: Number of Diapers: %4d\n", numDiapers);
  }

  @Override
  public boolean equals(Object obj) {
      if (obj instanceof Infant) {
          Infant other = (Infant) obj;
          return super.equals(other) && this.numDiapers == other.numDiapers;
      }
      return false;
  }

  @Override
  public double metabolizeAccumulatedCalories() {
      double weightGain = 0.0;
      if (getCaloriesAccumulator() >= 1200) {
          weightGain = 1.0;
      }
      setWeight(getWeight() + weightGain);
      setCaloriesAccumulator(0);
      return weightGain;
  }

  @Override
  public String move() {
      return "flail arms and legs";
  }
}
