public class Teen extends Person implements Mover {
  
  private int accumulatedCalories;

  public Teen(String name, int age) {
    super(name, age);
    this.accumulatedCalories = 0;
  }

  @Override
  public void metabolizeAccumulatedCalories() {
    int poundsGained = this.accumulatedCalories / 5000;
    this.setWeight(this.getWeight() + poundsGained);
    this.accumulatedCalories = 0;
  }

  @Override
  public String move() {
    return "run fast and jump";
  }

  public void eat(int calories) {
    this.accumulatedCalories += calories;
  }

}
