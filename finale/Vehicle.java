import java.util.ArrayList;
import java.util.Arrays;


  public abstract class Vehicle {
    protected Person[][] personsOnBoard;
    protected int numberOfRows;
    protected int maxSeatsPerRow;
    protected int[] numSeatsPerRow;


    // Constructor for all rows having the same number of seats
    public Vehicle(int numRows, int numSeatsPerRow) {
        this.numberOfRows = numRows;
        this.maxSeatsPerRow = numSeatsPerRow;
        this.numSeatsPerRow = new int[numRows];
        for (int i = 0; i < numRows; i++) {
            this.numSeatsPerRow[i] = numSeatsPerRow;
        }
        this.personsOnBoard = new Person[numRows][numSeatsPerRow];
    }

    // Constructor for different seat configurations in each row
    public Vehicle(int[] numSeatsPerRow) {
        this.numberOfRows = numSeatsPerRow.length;
        this.numSeatsPerRow = numSeatsPerRow;
        this.maxSeatsPerRow = calculateMaxSeatsPerRow();
        this.personsOnBoard = new Person[numberOfRows][maxSeatsPerRow];
    }

    // Constructor with driver and different seat configurations
    public Vehicle(Person driver, int[] numSeatsPerRow) throws InvalidDriverException{
        this(numSeatsPerRow);
        setDriver(driver);
    }

    // Helper method to calculate the maximum number of seats per row
    private int calculateMaxSeatsPerRow() {
        int maxSeats = numSeatsPerRow[0];
        for (int i = 1; i < numSeatsPerRow.length; i++) {
            if (numSeatsPerRow[i] > maxSeats) {
                maxSeats = numSeatsPerRow[i];
            }
        }
        return maxSeats;
    }

  public abstract boolean loadPassenger(Person p);

  public abstract int loadPassengers(Person[] peeps);


  public void setDriver(Person p) throws InvalidDriverException {
      if (!p.hasDriverLicense()) {
          throw new InvalidDriverException("Invalid driver age: " + p.getAge());
      }
      this.personsOnBoard[0][0] = p;
  }
  

  public Person getDriver() {
      return personsOnBoard[0][0];
  }

  public boolean hasDriver() {
    if (this.personsOnBoard[0][0] == null){
      return false;
    }else{
      return true;
    }
    }

  public int getNumberOfAvailableSeats() {
      int availableSeats = 0;
      for (int i = 0; i<this.numberOfRows;i++) {
          for (int j = 0; j< this.personsOnBoard[i].length;i++) {
              if (this.personsOnBoard[i][j] == null) {
                  availableSeats++;
              }
          }
      }
      return availableSeats;
  }

  public int getNumberOfAvailableSeatsInRow(int row) {
      if (row < 0 || row >= this.numberOfRows) {
          return -1;
      }
      int availableSeats = 0;
      for (int j = 0; j < this.personsOnBoard[row].length; j++) {
          if (this.personsOnBoard[row][j] == null) {
              availableSeats++;
          }
      }

      return availableSeats;
  }

  public int getNumberOfPeopleOnBoard() {
    int numberOfPeople = 0;
    for (int i = 0; i< this.numberOfRows;i++) {
        for (int j = 0; j < this.personsOnBoard[i].length; i++) {
            if (this.personsOnBoard[i][j]!= null) {
                numberOfPeople++;
            }
        }
    }
    return numberOfPeople;
}


public int getNumberOfPeopleInRow(int row) {
  if (row < 0 || row >= this.numberOfRows) {
    return -1;
      }
      int numberOfPeople = 0;
      for(int j =0; j<this.personsOnBoard[row].length; ++j){
        if(this.personsOnBoard[row][j]!= null){
          numberOfPeople ++;
        }
      }
      return numberOfPeople;
    }

public Person getPersonInSeat(int row, int col) {
  if (row < 0 || row >= this.numberOfRows){
    return null;
  }
  if(col < 0 || col >= this.personsOnBoard[row].length){
    return null;
  }
  return this.personsOnBoard[row][col];
}

public int[] getLocationOfPersonInVehicle(Person p) {
  int [] output = new int [2];
  for (int i = 0; i < this.numberOfRows; i++){
    for (int j = 0; j < this.personsOnBoard[i].length; i++){
      if(this.personsOnBoard[i][j].equals(p)){
        output[0]=i;
        output[1]=j;
        return output;
      }
    }
  }
  output[0] = -1;
  output[1]=-1;
  return output;
}



public Person[] getPeopleInRow(int row) {
  if(row< 0|| row >= this.numberOfRows){
    return null;
  }
  ArrayList<Person> arr = new ArrayList<>(); // Initialize the ArrayList
  for (int i = 0; i < this.personsOnBoard[row].length; i++){
    Person p = this.personsOnBoard[row][i];
    if (p!= null){
      arr.add(p);
    }
  }
  if (arr.size() == 0){
    return null;
  }

  Person [] output = new Person [arr.size()];
  for (int i = 0; i<arr.size(); i++){
    output[i] = arr.get(i);
}
  return output;
}



public Person[][] getPeopleOnBoard() {
  Person[][] output = new Person[numberOfRows][];
  for (int i = 0; i < this.numberOfRows; i++){
    output[i] = new Person [this.personsOnBoard[i].length];
    for(int j = 0; j < output[i].length; j++){
      output[i][j] = this.personsOnBoard[i][j];
    }
  }
  return output;
}



public boolean isPersonInVehicle(Person p) {
  for (int i=0; i < this.numberOfRows; i++){
    for (int j = 0; j < this.personsOnBoard[i].length; j++){
      if(p.equals(this.personsOnBoard[i][j])== true){
        return true;
      }
    }
  }
  return false;
}


  public boolean isPersonDriver(Person p) {
    if(this.personsOnBoard[0][0].equals(p)== true){
      return true;
    }
    return false;
  }

  private int getMaxSeatsPerRow(int[] numSeatsPerRow) {
      int maxSeats = 0;
      for (int numSeats : numSeatsPerRow) {
          if (numSeats > maxSeats) {
              maxSeats = numSeats;
          }
      }
      return maxSeats;
  }
}

