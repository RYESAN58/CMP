public class Infant extends Person {
    
  private static final int MAX_TOYS = 10;
  
  private class InfantToy {
      private final String name;
      private final int rating;
      
      public InfantToy(String name, int rating) {
          this.name = name;
          this.rating = rating;
      }
      
      @Override
      public String toString() {
          return String.format("InfantToy: Toy Name: %20s | Rating %4d\n", name, rating);
      }
  }
  
  private InfantToy[] toys;
  private int numInfantToys;
  
  public Infant() {
      this.toys = new InfantToy[MAX_TOYS];
      this.numInfantToys = 0;
  }
  
  public Infant(String name, int age, double height, double weight, char gender, int id) {
      super(name, age, height, weight, gender, id, 0);
      this.toys = new InfantToy[MAX_TOYS];
      this.numInfantToys = 0;
  }
  
  public void addInfantToy(String name, int rating) {
      if (numInfantToys < MAX_TOYS) {
          toys[numInfantToys] = new InfantToy(name, rating);
          numInfantToys++;
      }
  }
  
  public String getInfantToyAsString(int index) {
      if (index < 0 || index >= numInfantToys) {
          return "invalid index " + index;
      } else {
          return toys[index].toString();
      }
  }
  
  public int getNumInfantToys() {
      return numInfantToys;
  }
  
  public String getInfantToyName(int index) {
      if (index < 0 || index >= numInfantToys) {
          return "invalid index " + index;
      } else {
          return toys[index].name;
      }
  }
  
  public int getInfantToyRating(int index) {
      if (index < 0 || index >= numInfantToys) {
          return -1;
      } else {
          return toys[index].rating;
      }
  }
  
  public int getHighestInfantToyRating() {
      int highestRating = 0;
      for (int i = 0; i < numInfantToys; i++) {
          if (toys[i].rating > highestRating) {
              highestRating = toys[i].rating;
          }
      }
      return highestRating;
  }
  
  @Override
  public void printDetails() {
      super.printDetails();
      System.out.printf("Infant: Number of Toys: %4d | Infant Toys:\n", numInfantToys);
      for (int i = 0; i < numInfantToys; i++) {
          System.out.print(toys[i].toString());
      }
  }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(super.toString());
      sb.append(String.format("Infant: Number of Toys: %4d | Infant Toys:\n", numInfantToys));
      for (int i = 0; i < numInfantToys; i++) {
          sb.append(toys[i].toString());
      }
      return sb.toString();
  }
}
