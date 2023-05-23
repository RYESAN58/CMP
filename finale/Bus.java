
public class Bus extends Car {
public Bus(int[] numSeatsPerRow) {
super(2, 2 * numSeatsPerRow.length - 1, numSeatsPerRow);
}
public Bus(Person driver, int[] numSeatsPerRow) throws InvalidDriverException {
super(2, 2 * numSeatsPerRow.length - 1, driver, numSeatsPerRow);
}
public boolean canOpenDoor(Person p) {
int[] location = getLocationOfPersonInVehicle(p);
if (((location[0] == 0 && location[1] == 0) || location[0] == numberOfRows - 1) && p.getHeight() > 40 && p.getAge() > 5) {
return true;
}
return false;
}
public boolean canOpenWindow(Person p) {
if (super.canOpenWindow(p) && p.getAge() > 5) {
return true;
}
return false;
}
public String toString() {
String s = "Bus is an extension of: " + super.toString();
return s;
}
public String departure() {
String departure = super.departure();
departure += "The Bus\n";
return departure;
}
public String arrival() {
String arrival = super.arrival();
arrival += "Of The Bus\n";
return arrival;
}
public String doNotDisturbTheDriver() {
String doNotDisturbTheDriver = "No Backseat Driving\nOn The Bus\n";
return doNotDisturbTheDriver;
}
}