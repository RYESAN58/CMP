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
    this.ageInDogYears = 7;

  }
  public Dog(String name, double weight, double height, boolean isVaccinated, int ageInDogYears){
    this();
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.isVaccinated = isVaccinated;
    this.ageInDogYears = ageInDogYears;
  }
  public Dog(String name){
    this();
    this.name = name;
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
  
  @Override
  public String toString(){
    String s = "dog Name: " + this.name + " dog Weight: " + this.weight + " dog height: " + this.height;
    if(isVaccinated){
      s += " Dog is Vaxxed" + " Dog is " + ageInDogYears + " Years old in dog years.";
    }else{
      s += " Dog isn't Vaxxed " + "Dog is " + ageInDogYears + " Years old in dog years.";
    }
    return s;
  }
  @Override
  public boolean equals(Object obj){
    if(obj == null){return false;}
    if(this == obj){return true;}
    if(obj instanceof Dog){
      Dog other = (Dog) obj;
      if (ageInDogYears == other.ageInDogYears){
        if(Math.abs(height-other.height) <0.5){
          if(Math.abs(weight - other.weight)< 0.5){
            if(isVaccinated == other.isVaccinated){
              if((name !=null) && (other.name!= null)){
                if(name.equals(other.name)){
                  return true;
                }
              }
            }
          }
        }
      }
    }
    return false;
  }
}
