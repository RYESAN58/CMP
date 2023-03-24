public abstract class Person extends Passenger {

  private int numOffspring;

  public Person() {
      super();
      numOffspring = 0;
  }

  public Person(int numOffspring) {
      super();
      setNumOffspring(numOffspring);
  }

  public Person(String name, int birthYear, double weight, double height, char gender, int numCarryOn, int numOffspring) {
      super(name, birthYear, weight, height, gender, numCarryOn);
      setNumOffspring(numOffspring);
  }

  public void setNumOffspring(int numOffspring) {
      if (numOffspring < 0) {
          this.numOffspring = 0;
      } else {
          this.numOffspring = numOffspring;
      }
  }

  public int getNumOffspring() {
      return numOffspring;
  }

  @Override
  public void printDetails() {
      super.printDetails();
      System.out.printf("Person: Number of Offspring: %4d\n", numOffspring);
  }

  @Override
  public String toString() {
      return super.toString() + String.format("Person: Number of Offspring: %4d\n", numOffspring);
  }

  @Override
  public boolean equals(Object obj) {
      if (obj instanceof Person) {
          Person other = (Person) obj;
          return super.equals(other) && this.numOffspring == other.numOffspring;
      }
      return false;
  }
}
