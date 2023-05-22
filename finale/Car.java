import java.util.ArrayList;
import java.util.Arrays;

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
        this.numDoors = numDoors;
        this.numWindows = numWindows;
    }

    public Car(int numDoors, int numWindows, Person driver, int[] numSeatsPerRow) throws InvalidDriverException {
        super(driver, numSeatsPerRow);
        this.numDoors = numDoors;
        this.numWindows = numWindows;
    }

    public boolean canOpenDoor(Person p) {
        int doorRows = Math.min(numDoors / 2, numberOfRows);
        for (int row = 0; row < doorRows; row++) {
            if (p.getAge() > 5 && (p.equals(personsOnBoard[row][0]) || p.equals(personsOnBoard[row][numSeatsPerRow[row] - 1]))) {
                return true;
            }
        }
        return false;
    }

    public boolean canOpenWindow(Person p) {
        int windowRows = Math.min(numWindows / 2, numberOfRows);
        for (int row = 0; row < windowRows; row++) {
            if (p.getAge() > 2 && (p.equals(personsOnBoard[row][0]) || p.equals(personsOnBoard[row][numSeatsPerRow[row] - 1]))) {
                return true;
            }
        }
        return false;
    }
    public int[][] getSeatConfiguration() {
      int[][] seatConfig = new int[numSeatsPerRow.length][];
      for (int i = 0; i < numSeatsPerRow.length; i++) {
          seatConfig[i] = new int[numSeatsPerRow[i]];
      }
      return seatConfig;
  }


    public int getNumDoors() {
        return numDoors;
    }

    public int getNumWindows() {
        return numWindows;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car other = (Car) o;
        return numDoors == other.numDoors &&
               numWindows == other.numWindows &&
               Arrays.equals(numSeatsPerRow, other.numSeatsPerRow) &&
               Arrays.deepEquals(getSeatConfiguration(), other.getSeatConfiguration());
    }
    
    

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numDoors;
        result = 31 * result + numWindows;
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Car: number of doors = %02d | number of windows = %02d | number of rows = %02d | seats per row = %s | names of people on board = ",
                numDoors, numWindows, numberOfRows, Arrays.toString(numSeatsPerRow).replace(" ", "")));
    
        ArrayList<String> names = new ArrayList<>();
        for (Person[] row : personsOnBoard) {
            for (Person person : row) {
                if (person != null) {
                    names.add(person.getName());
                }
            }
        }
        sb.append("[" + String.join(",", names) + "]");
        sb.append("\n");
        return sb.toString();
    }
    public int getNumberOfSeats() {
      int totalSeats = 0;
      for (int seatsInRow : numSeatsPerRow) {
          totalSeats += seatsInRow;
      }
      return totalSeats;
  }

    @Override
    public int compareTo(Car c) {
        int thisTotalSeats = getNumberOfSeats();
        int otherTotalSeats = c.getNumberOfSeats();

        if (thisTotalSeats < otherTotalSeats) {
            return -1;
        } else if (thisTotalSeats > otherTotalSeats) {
            return 1;
        } else {
            return 0;
        }
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

    private boolean canLoadPerson(Person person) {
      int personHeight = person.getHeight();
      if (personHeight < 36) {
          return false;
      }
      if (person.getAge() < 5 && numDoors >= 2 * numberOfRows) {
          return false;
      }
      return true;
  }
  @Override
  public boolean loadPassenger(Person p) {
      if (p.getAge() < 5 || p.getHeight() < 36) {
          return false; // Person below age 5 or height less than 36 not allowed in the first row
      }
  
      for (int row = 0; row < numberOfRows; row++) {
          for (int seat = 0; seat < numSeatsPerRow[row]; seat++) {
              if (personsOnBoard[row][seat] == null) {
                  personsOnBoard[row][seat] = p;
                  return true;
              }
          }
      }
      return false; // No available seat found
  }
  
  @Override
  public int loadPassengers(Person[] peeps) {
      int loaded = 0;
      for (Person p : peeps) {
          if (loadPassenger(p)) {
              loaded++;
          } else {
              break; // Stop loading passengers if there is no available seat
          }
      }
      return loaded;
  }
  
}
