public class Airplane {
  private Passenger[] passengers;
  private String airplaneName;
  private int numPassengers;

  public Airplane(){
    this.passengers = new Passenger[100];
    this.numPassengers = 0;
  }
  public Airplane(String AirplaneName){
    this();
    this.passengers = new Passenger[100];
    this.numPassengers = 0;
    this.airplaneName = AirplaneName;
  }
  public Airplane(int numPass){
    this();
    if(numPass < 0){
      this.passengers = new Passenger[0];
    }else{
      this.passengers = new Passenger[numPass];
    };
  }
  public Airplane(String airplaneName, int numPass){
    this();
    if(numPass < 0){
      this.passengers = new Passenger[0];
      this.numPassengers = 0;
    }else{
      this.passengers = new Passenger[numPass];
      this.numPassengers = 0;
    };
    this.airplaneName = airplaneName;
  }
  public void addPassenger(Passenger x){
    this.passengers[numPassengers] = x;
    numPassengers +=1;
  }
  public String getAirplaneName(){
    return this.airplaneName;
  }
  public Passenger getPassenger(int index){
    if(index > numPassengers || index < 0){
      return null;
    }
    return passengers[index];
  }
  public int getNumPassengers(){
    return this.numPassengers;
  }
  public Passenger getFirstPassenger(){
    return this.passengers[0];
  }
  public Passenger getLastPassenger(){
    if (numPassengers == 0){
      return null;
    }
    return this.passengers[this.numPassengers-1];
  }
  public Passenger[] getPassengers(){
    return this.passengers;
  }
  public void setAirplaneName(String s){
    this.airplaneName = s;
  }
  public void printAllDetails(){
    System.out.printf("AirplaneName: %20s | Number of Passengers: %4d | Airplane Size: %4d\n");
  }
  public Passenger removePassenger(int index){
    Passenger temp = passengers[index];
    this.passengers[index] = null;
    this.numPassengers -=1;
    return temp;
  }
  public void removeAllPassengers(){
    for(int i = 0 ; i < numPassengers-1; i++){
      passengers[i] = null;
    }
  }
}
