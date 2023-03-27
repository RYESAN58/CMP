package midterm168;

public class Person implements Comparable<Person> {
  private String name;
  private int birthYear;

  public Person() {
      this.name = "";
      this.birthYear = 0;
  }

  public Person(String name, int birthYear) {
      this.name = name;
      this.birthYear = birthYear;
  }

  public String getName() {
      return name;
  }

  public int getBirthYear() {
      return birthYear;
  }

  public void setName(String name) {
      this.name = name;
  }

  public void setBirthYear(int year) {
      this.birthYear = year;
  }

  @Override
  public boolean equals(Object obj) {
      if (obj == this) {
          return true;
      }
      if (!(obj instanceof Person)) {
          return false;
      }
      Person other = (Person) obj;
      return this.name.equals(other.name)
          && this.birthYear == other.birthYear;
  }

  @Override
  public String toString() {
      return String.format("Person: Name: %30s | Birth Year: %4d", name, birthYear);
  }

  @Override
  public int compareTo(Person p) {
      return this.birthYear - p.birthYear;
  }
}

