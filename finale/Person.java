public class Person {
  private String name;
  private boolean hasDriverLicense;
  private int age;
  private int height;
  
  public Person(String name, boolean hasDriverLicense, int age, int height) {
  this.name = name;
  this.hasDriverLicense = hasDriverLicense;
  this.age = age;
  this.height = height;
  }
  public String getName() {
  return this.name;
  }
  public boolean hasDriverLicense() {
  return this.hasDriverLicense;
  }
  public int getAge() {
  return this.age;
  }
  public int getHeight() {
  return this.height;
  }
  public Person clone() {
  Person p = new Person(this.name, this.hasDriverLicense, this.age, this.height);
  return p;
  }
  
  @Override
  public boolean equals(Object o) {
  if (o instanceof Person) {
  Person a = (Person)o;
  if (a.name == this.name && a.hasDriverLicense == this.hasDriverLicense && a.age == this.age && a.height == this.height) {
  return true;
  }
  }
  return false;
  }
  
  @Override
  public String toString() {
  if (hasDriverLicense) {
  return String.format("Person [name= %10s | age= %02d | height= %02d | has license]", name, age, height);
  }
  else {
  return String.format("Person [name= %10s | age= %02d | height= %02d | no license]", name, age, height);
  }
  }
  
  }
  