public class Bicycle extends Vehicle implements Comparable<Bicycle> {
  private double weight;
  public static int[] seats = {1};
  public final double ACCURACY_RANGE = 0.5;
  
  public Bicycle() {
  super(1, 1);
  this.weight = 0;
  }
  public Bicycle(Person driver)  throws InvalidDriverException{
  super(driver, seats);
  this.weight = 0;
  }
  public Bicycle(Person driver, double weight)throws InvalidDriverException
   {
  super(driver, seats);
  if (weight >= 0) {
  this.weight = weight;
  }
  else {
  this.weight = 0;
  }
  }
  public double getWeight() {
  return this.weight;
  }
  public void setWeight(double weight) {
  this.weight = weight;
  }
  public void setDriver(Person p) throws InvalidDriverException {
  if (p.getAge() > 3) {
  personsOnBoard[0][0] = p;
  }
  else {
  throw new InvalidDriverException();
  }
  }
  @Override
  public boolean equals(Object o) {
  if (o instanceof Bicycle) {
  Bicycle a = (Bicycle)o;
  if (Math.abs(a.weight - this.weight) <= .5) {
  return true;
  }
  }
  return false;
  }
  @Override
  public String toString() {
  return String.format("Bicycle [ rider= " + getDriver().getName() + " | weight= " + weight + " ]");
  }
  public boolean loadPassenger(Person p){
  return false;
  }
  public int loadPassengers(Person[] peeps){
  return 0;
  }
  public int compareTo(Bicycle b) {
  if (this.getWeight() - b.getWeight() > ACCURACY_RANGE) {
  return 1;
  }
  else if (b.getWeight() - this.getWeight() > ACCURACY_RANGE) {
  return -1;
  }
  return 0;
  }
  }
  