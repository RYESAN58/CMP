public class Animal {
  private String name;
  private int birthYear;
  private double weight;
  private char gender;
  
  public Animal(){
    name = "";
    birthYear= 1900;
    weight = 0.0;
    gender = 'u';
  }
  public Animal(String w, int x, double y, char z){
    name = w;
    birthYear= x;
    weight = y;
    gender = z;
  }
  public void setName(String nameSetter){
    this.name = nameSetter;
  }
  public String getName(){
    return name;
  }
  public int getBirthYear(){
    return birthYear;
  }
  public void setBirthYear(int newBirth){
    this.birthYear = newBirth;
  }
  public double getWeight() {
    return weight;
  }
  public void setWeight(double newWeight) {
    if(newWeight < 0){
      weight = -1;
    }else{
      weight = newWeight;
    }
  }
  public char getGender(){
    return gender;
  }
  public void setGender(char newC ){
    
    if((newC == 'f') || (newC == 'F') || (newC == 'm') || (newC == 'M')){
      gender = newC;
    }else{
      gender = 'u';
    }
  }
  public int calculateAge(int currentYear ){
    if (currentYear <  birthYear){
      return -1;
    }else{
      return currentYear - birthYear;
    }
  }public boolean isMale(){
    if (gender == 'm' || gender == 'M'){
      return true;
    }else{
      return false;
    }
  }public boolean isFemale(){
    if (gender == 'f' || gender == 'F'){
      return true;
    }else{
      return false;
    }
  }
  public void gainWeight() {
    weight += 1;
  }
  public void gainWeight(double newww) {
    double temp = weight + newww;
    if (temp >= 0){
      weight = temp;
    }else{
      
    }
  }
  public void loseWeight() {
    if(weight > 0){
      weight -= 1;
    }else{
      
    }
  }
  public void loseWeight(double yy) {
    double temp = weight - yy;
    if(temp >= 0){
      weight = temp;
    }else{
      
    }
  }
  public void printDetails(){
    System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c\n", name ,birthYear,weight,gender);
  }
}