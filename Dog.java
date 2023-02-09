public class Dog {
  private String name;
  private double weight;
  private double height = 0.0;
  private boolean isVaccinated;
  private int ageInDogYears;
  public Dog(){
    this.name = "doggy";
    this.weight = 0;
    this.height = 0;
    this.isVaccinated = true;
    this.isVaccinated = false;

  }
  public Dog(String name, double weight, double height, boolean isVaccinated, int ageInDogYears){
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.isVaccinated = isVaccinated;
    this.ageInDogYears = ageInDogYears;
  }
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name; 
  }
  public double getWeight(){
    return this.weight;
  }
  public void setWeight(Double weight){
    this.weight = weight; 
  }
  public double getheight(){
    return this.weight;
  }
  public void setheight(Double height){
    this.height = height; 
  }
  public boolean getVaccination(){
    return this.isVaccinated;
  }
  public void setVaccination(Boolean isVaccinated){
    this.isVaccinated = isVaccinated; 
  }
  public int getAgeInDogYears(){
    return this.ageInDogYears;
  }
  public void setAgeInDogYears(int ageInDogYears){
    this.ageInDogYears = ageInDogYears; 
  }
  
  
}
