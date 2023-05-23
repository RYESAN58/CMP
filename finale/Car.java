public class Car extends Vehicle implements Comparable<Car>, Announcements {
  private int numDoors;
  private int numWindows;
  
  public Car(int numDoors, int numWindows) {
  super(2, 2);
  this.numDoors = numDoors;
  this.numWindows = numWindows;
  }
  public Car(int numDoors, int numWindows, int numSeatsPerRow) {
  super(2, numSeatsPerRow);
  this.numDoors = numDoors;
  this.numWindows = numWindows;
  }
  public Car(int numDoors, int numWindows, int[] numSeatsPerRow) {
  super(numSeatsPerRow);
  this.numWindows = numWindows;
  this.numDoors = numDoors;
  }
  public Car(int numDoors, int numWindows, Person driver, int[] numSeatsPerRow)  throws InvalidDriverException {
  super(driver, numSeatsPerRow);
  this.numDoors = numDoors;
  this.numWindows = numWindows;
  }
  public boolean canOpenDoor(Person p) {
  int[] location = getLocationOfPersonInVehicle(p);
  if (numDoors < 2 * numberOfRows) {
  if (location[0] < numberOfRows / 2 && (location[1] == 0 || location[1] == numSeatsPerRow[location[0]]) && p.getAge() > 5) {
  return true;
  }
  }
  else if ((location[1] == 0 || location[1] == numSeatsPerRow[location[0]]) && p.getAge() > 5) {
  return true;
  }
  return false;
  }
  public boolean canOpenWindow(Person p) {
  int[] location = getLocationOfPersonInVehicle(p);
  if (numWindows < 2 * numberOfRows) {
  if (location[0] < numberOfRows / 2 && (location[1] == 0 || location[1] == numSeatsPerRow[location[0]]) && p.getAge() > 2) {
  return true;
  }
  }
  else if ((location[1] == 0 || location[1] == numSeatsPerRow[location[0]]) && p.getAge() > 2) {
  return true;
  }
  return false;
  }
  public int getNumDoors() {
  return this.numDoors;
  }
  public int getNumWindows() {
  return this.numWindows;
  }
  @Override
  public boolean equals(Object o) {
  if (o instanceof Car) {
  Car a = (Car)o;
  boolean sameArray = true;
  if (this.numberOfRows == a.numberOfRows && a.maxSeatsPerRow == this.maxSeatsPerRow) {
  for (int i = 0; i < numberOfRows; i++) {
  if (a.numSeatsPerRow[i] != this.numSeatsPerRow[i]) {
  sameArray = false;
  }
  }
  }
  if (a.numDoors == this.numDoors && a.numWindows == this.numWindows && sameArray) {
  return true;
  }
  }
  return false;
  }
  @Override
  public String toString() {
  String seatsPerRow = "[";
  for (int i = 0; i < numberOfRows; i++) {
  seatsPerRow += Integer.toString(numSeatsPerRow[i]);
  if (i != numberOfRows - 1) {
  seatsPerRow += ",";
  }
  }
  seatsPerRow += "]";
  String names = "[";
  for (int i = 0; i < numberOfRows; i++) {
  for (int j = 0; j < maxSeatsPerRow; j++) {
  if (personsOnBoard[i][j] != null) {
  names += personsOnBoard[i][j].getName();
  names += ",";
  }
  }
  }
  return String.format("Car: number of doors = %02d | number of windows = %02d | number of rows = %02d | seats per row = %s | names of people on board = %s\n", numDoors, numWindows, numberOfRows, seatsPerRow, names);
  }
  public int compareTo(Car car) {
  int numSeatsThis = 0;
  int numSeatsCar = 0;
  for (int i = 0; i < this.numberOfRows; i++) {
  numSeatsThis += this.getNumberOfAvailableSeatsInRow(i);
  }
  for (int i = 0; i < car.numberOfRows; i++) {
  numSeatsCar += car.getNumberOfAvailableSeatsInRow(i);
  }
  if (numSeatsThis < numSeatsCar) {
  return -1;
  }
  else if (numSeatsThis == numSeatsCar) {
  return 0;
  }
  else {
  return 1;
  }
  }
  
  @Override
  public boolean loadPassenger(Person p) {
  if (p.getAge() < 5 || p.getHeight() < 36) {
  for (int i = 0; i < numberOfRows; i++) {
  for (int j = 0; j < numSeatsPerRow[i]; j++) {
  if (personsOnBoard[i][j] == null) {
  return true;
  }
  }
  }
  }
  else if (getNumberOfAvailableSeats() > 0) {
  return true;
  }
  return false;
  }
  @Override
  public int loadPassengers(Person[] peeps) {
  if (peeps.length <= getNumberOfAvailableSeats()) {
  return peeps.length;
  }
  return getNumberOfAvailableSeats();
  }
  @Override
  public String departure() {
  return "All Aboard\n";
  }
  @Override
  public String arrival() {
  return "Everyone Out\n";
  }
  @Override
  public String doNotDisturbTheDriver() {
  return "No Backseat Driving\n";
  }
  }