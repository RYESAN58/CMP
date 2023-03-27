public class Infant extends Person implements Mover {
  private InfantToy[] toys;
  private int numInfantToys;
  private static final int MAX_CAPACITY = 10;


  public class InfantToy {
      private String infantToyName;
      private int infantToyRating;

      public InfantToy(String name, int rating) {
          this.infantToyName = name;
          this.infantToyRating = rating;
      }

      public String toString() {
          return String.format("InfantToy: Toy Name: %20s | Rating %4d\n",
                                this.infantToyName, this.infantToyRating);
      }

      public String getInfantToyName() {
          return this.infantToyName;
      }

      public int getInfantToyRating() {
          return this.infantToyRating;
      }
  }

  public Infant() {
      // super("", 0, 0.0, 0.0, ' ', 0);
      this.toys = new InfantToy[MAX_CAPACITY];
      this.numInfantToys = 0;
  }

  public Infant(String name, int age, double weight, double height, char gender, int ssn) {
      super(name, age, weight, height, gender, ssn, 0);
      this.toys = new InfantToy[MAX_CAPACITY];
      this.numInfantToys = 0;
  }

  public void addInfantToy(String name, int rating) {
      if (this.numInfantToys < MAX_CAPACITY) {
          this.toys[numInfantToys++] = new InfantToy(name, rating);
      }
  }

  public String getInfantToyAsString(int index) {
      if (index >= 0 && index < this.numInfantToys) {
          return this.toys[index].toString();
      } else {
          return "invalid index " + index;
      }
  }

  public int getNumInfantToys() {
      return this.numInfantToys;
  }

  public String getInfantToyName(int index) {
      if (index >= 0 && index < this.numInfantToys) {
          return this.toys[index].getInfantToyName();
      } else {
          return "invalid index " + index;
      }
  }

  public int getInfantToyRating(int index) {
      if (index >= 0 && index < this.numInfantToys) {
          return this.toys[index].getInfantToyRating();
      } else {
          return -1;
      }
  }

  public int getHighestInfantToyRating() {
      int highestRating = 0;
      for (int i = 0; i < this.numInfantToys; i++) {
          if (this.toys[i].getInfantToyRating() > highestRating) {
              highestRating = this.toys[i].getInfantToyRating();
          }
      }
      return highestRating;
  }

  public void metabolizeAccumulatedCalories() {
      int accumulatedCalories = getAccumulatedCalories();
      if (accumulatedCalories >= 1200) {
          setWeight(getWeight() + 1);
          setAccumulatedCalories(accumulatedCalories - 1200);
      }
  }

  public String move() {
      return "flail arms and legs";
  }

  @Override
  public void printDetails() {
      super.printDetails();
      System.out.printf("Infant: Number of Toys: %4d | Infant Toys:\n", this.numInfantToys, this.infantToyRating);
  }
  @Override
  public void eat(Food food) {
      if (food instanceof Formula) {
          Formula formula = (Formula) food;
          int calories = formula.getCalories();
          setAccumulatedCalories(getAccumulatedCalories() + calories);
          if (getAccumulatedCalories() >= 1200) {
              setWeight(getWeight() + 1);
              setAccumulatedCalories(getAccumulatedCalories() - 1200);
          }
      }
  }

  @Override
  public void metabolize() {
      setAccumulatedCalories(getAccumulatedCalories() - 100);
  }

  @Override
  public void metabolizeAccumulatedCalories() {
      while (getAccumulatedCalories() >= 1200) {
          setWeight(getWeight() + 1);
          setAccumulatedCalories(getAccumulatedCalories() - 1200);
      }
  }

  @Override
  public String move() {
      return "flail arms and legs";
  }
}