public class Food {
  private String name;
  private int calories;

  public Food(String name, int calories) {
      this.name = name;
      this.calories = calories;
  }

  public void setName(String name) {
      this.name = name;
  }

  public String getName() {
      return name;
  }

  public void setCalories(int calories) {
      this.calories = calories;
  }

  public int getCalories() {
      return calories;
  }

  @Override
  public String toString() {
      return String.format("Food - name: %10s | calories: %4d", name, calories);
  }

  @Override
  public boolean equals(Object obj) {
      if (obj == this) {
          return true;
      }

      if (!(obj instanceof Food)) {
          return false;
      }

      Food other = (Food) obj;
      return name.equals(other.name) && calories == other.calories;
  }
}
