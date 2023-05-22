public class Bicycle extends Vehicle implements Comparable<Bicycle> {
  private double weight;

  public Bicycle() throws InvalidDriverException{
      super(1, 1);
      this.weight = 0;
  }

  public Bicycle(Person driver) throws InvalidDriverException {
      super(driver ,new int[]{1});
      this.weight = 0;
  }

  public Bicycle(Person driver, double weight) throws InvalidDriverException {
      super(driver, new int[]{1});
      if (weight < 0) {
          this.weight = 0;
      } else {
          this.weight = weight;
      }
  }

  @Override
  public boolean equals(Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      Bicycle bicycle = (Bicycle) o;
      return Math.abs(this.weight - bicycle.weight) <= 0.5;
  }


  public void setDriver(Person p) throws InvalidDriverException {
          super.setDriver(p);
  }

  public void setWeight(double weight) {
    if (weight < 0) {
        this.weight = 0;
    } else {
        this.weight = weight;
    }
}

  public int compareTo(Bicycle b) {
      double accuracyRange = 0.5;
      double weightDifference = this.weight - b.weight;
      if (weightDifference > accuracyRange) {
          return 1;
      } else if (weightDifference < -accuracyRange) {
          return -1;
      } else {
          return 0;
      }
  }

  public String toString() {
      return "Bicycle [ rider= " + getDriver().getName() + " | weight= " + weight + " ]";
  }

  public double getWeight() {
      return weight;
  }

  // Override loadPassenger and loadPassengers methods
  public boolean loadPassenger(Person p) {
      return false; // A Bicycle cannot have any passengers
  }

  public int loadPassengers(Person[] peeps) {
      return 0; // A Bicycle cannot have any passengers
  }
}
