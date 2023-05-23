import java.util.Scanner;
import java. util. Arrays;

public class RecursionQuestion {
public static int helperSearch(Car[] cars, Car c, int low, int high) {
boolean unfound = false;
int mid = low + (high - low) / 2;
System.out.println("s=" + low + ", e=" + high + ", mid=" + mid);
if (high >= low && !unfound) {
if (cars[mid].compareTo(c) == 1) {
System.out.println("go left");
helperSearch(cars, c, low, mid - 1);
}
else if (cars[mid].compareTo(c) == -1) {
System.out.println("go right");
helperSearch(cars, c, mid + 1, high);
}
else {
System.out.println("FOUND at " + mid);
System.out.println();
System.out.println();
return mid;
}
}
else {
System.out.println("Not Found");
unfound = true;
}
return -1;
}
public static int binarySearch(Car[] cars, Car c) {
Arrays.sort(cars);
String names = "[";
for (int i = 0; i < c.numberOfRows; i++) {
for (int j = 0; j < c.maxSeatsPerRow; j++) {
if (c.personsOnBoard[i][j] != null) {
names += c.personsOnBoard[i][j].getName();
names += ",";
}
}
}
String car = "Looking for " + String.format("Car: number of doors = %02d | number of windows = %02d | number of rows = %02d | seats per row = ", c.getNumDoors(), c.getNumWindows(), c.numberOfRows);
car += "[";
for (int i = 0; i < c.numSeatsPerRow.length; i++) {
car += Integer.toString(c.numSeatsPerRow[i]);
if (i != c.numSeatsPerRow.length - 1) {
car += ",";
}
}
car += "]";
car += String.format(" | names of people on board = %s]", names);
System.out.println(car);
System.out.println();
return helperSearch(cars, c, 0, cars.length - 1);
}
public static void main(String[] args) {
Car [] cars = new Car[10];
int [][] seatConfigurations = {new int[]{2,2}, new int[]{2,3},
new int[]{2,2,3}, new int[]{2,3,3}, new int[]{2,3,4}, new int[]{2,4,3},
new int[]{2,3,5}, new int[]{2,4,4}, new int[]{2,4,5}, new int[]{3,4,5}};
for(int i=0; i<cars.length; i++){
cars[i] = new Car(2, 4, seatConfigurations[i]);
}
Scanner kb = new Scanner(System.in);
// System.out.print("enter seat info");
String [] input = kb.nextLine().split(" ");
int [] rowSeats = new int[input.length];
for(int i=0; i<input.length; i++){
rowSeats[i] = Integer.parseInt(input[i]);
}
Car car = new Car(2, 4, rowSeats);
binarySearch(cars, car);
// Bus bus = new Bus(rowSeats);
// System.out.println(bus.toString());
}
}