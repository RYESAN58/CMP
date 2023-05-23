
public abstract class Vehicle {
protected Person[][] personsOnBoard;
protected int numberOfRows;
protected int maxSeatsPerRow;
protected int[] numSeatsPerRow;

public Vehicle(int numberOfRows, int numSeatsPerRow) {
this.numberOfRows = numberOfRows;
this.maxSeatsPerRow = numSeatsPerRow;
this.numSeatsPerRow = new int[numberOfRows];
for (int i = 0; i < numberOfRows; i++) {
this.numSeatsPerRow[i] = numSeatsPerRow;
}
personsOnBoard = new Person[numberOfRows][numSeatsPerRow];
}
public Vehicle(int[] numSeatsPerRow) {
this.numSeatsPerRow = numSeatsPerRow;
this.numberOfRows = numSeatsPerRow.length;
maxSeatsPerRow = 0;
for (int i = 0; i < numberOfRows; i++) {
if (numSeatsPerRow[i] > maxSeatsPerRow) {
maxSeatsPerRow = numSeatsPerRow[i];
}
}
this.personsOnBoard = new Person[numberOfRows][maxSeatsPerRow];
}
public Vehicle(Person driver, int[] numSeatsPerRow) {
this.numSeatsPerRow = numSeatsPerRow;
this.numberOfRows = numSeatsPerRow.length;
maxSeatsPerRow = 0;
for (int i = 0; i < numberOfRows; i++) {
if (numSeatsPerRow[i] > maxSeatsPerRow) {
maxSeatsPerRow = numSeatsPerRow[i];
}
}
this.personsOnBoard = new Person[numberOfRows][maxSeatsPerRow];
personsOnBoard[0][0] = driver;
}
public abstract boolean loadPassenger(Person p);
public abstract int loadPassengers(Person[] peeps);
public void setDriver(Person p) throws InvalidDriverException {
if (p.hasDriverLicense()) {
personsOnBoard[0][0] = p;
}
else {
throw new InvalidDriverException();
}
}
public Person getDriver(){
return personsOnBoard[0][0];
}
public boolean hasDriver() {
if (personsOnBoard[0][0] == null) {
return false;
}
return true;
}
public int getNumberOfAvailableSeats() {
int numSeats = 0;
for (int i = 0; i < numberOfRows; i++) {
numSeats += numSeatsPerRow[i];
}
numSeats -= getNumberOfPeopleOnBoard();
return numSeats;
}
public int getNumberOfAvailableSeatsInRow(int row) {
if (row < 0 || row > numberOfRows) {
return -1;
}
int numSeats = numSeatsPerRow[row];
numSeats -= getNumberOfPeopleInRow(row);
return numSeats;
}
public int getNumberOfPeopleOnBoard() {
int numPeople = 0;
for (int i = 0; i < numberOfRows; i++) {
for (int j = 0; j < maxSeatsPerRow; j++) {
if (personsOnBoard[i][j] != null) {
numPeople++;
}
}
}
return numPeople;
}
public int getNumberOfPeopleInRow(int row) {
int numPeople = 0;
for (int i = 0; i < maxSeatsPerRow; i++) {
if (personsOnBoard[row][i] != null) {
numPeople++;
}
}
return numPeople;
}
public Person getPersonInSeat(int row, int col) {
return personsOnBoard[row][col];
}
public int[] getLocationOfPersonInVehicle(Person p) {
int[] location = new int[2];
location[0] = -1;
location[1] = -1;
for (int i = 0; i < numberOfRows; i++) {
for (int j = 0; j < maxSeatsPerRow; j++) {
if (personsOnBoard[i][j].equals(p)) {
location[0] = i;
location[1] = j;
}
}
}
return location;
}
public Person[] getPeopleInRow(int row) {
if (row < 0 || row >= numberOfRows) {
return null;
}
boolean returnNull = true;
Person[] peopleInRow = new Person[getNumberOfPeopleInRow(row)];
for (int i = 0; i < maxSeatsPerRow; i++) {
if (personsOnBoard[row][i] != null) {
for (int j = 0; j < numSeatsPerRow[row]; j++) {
if (peopleInRow[j] == null) {
peopleInRow[j] = personsOnBoard[row][i].clone();
break;
}
}
returnNull = false;
}
}
if (returnNull) {
return null;
}
else {
return peopleInRow;
}
}
public Person[][] getPeopleOnBoard() {
Person[][] people = new Person[numberOfRows][maxSeatsPerRow];
for (int i = 0; i < numberOfRows; i++) {
for (int j = 0; j < maxSeatsPerRow; j++) {
people[i][j] = personsOnBoard[i][j];
}
}
return people;
}
public boolean isPersonInVehicle(Person p) {
for (Person[] persons : personsOnBoard) {
for (Person person : persons) {
if (person.equals(p)) {
return true;
}
}
}
return false;
}
public boolean isPersonDriver(Person p) {
if (personsOnBoard[0][0].equals(p)) {
return true;
}
return false;
}
}
