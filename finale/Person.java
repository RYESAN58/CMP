import java.util.Formatter;

public class Person {

private String name;

private boolean hasDriverLicense;

private int age;

private int height; // constructor

Person(String name, boolean hasDriverLicense, int age, int height) {

this.name = name;

this.hasDriverLicense = hasDriverLicense;

this.age = age;

this.height = height;

}

public String getName() {

return name;

}

public boolean hasDriverLicense() {

return this.hasDriverLicense;

}

public int getAge() {

return age;

}

public int getHeight() {

return height;

}

public Person clone() {

Person ret = new Person(name, hasDriverLicense, age, height);

return ret;

}

@Override
public String toString() {
  String licenseStatus = hasDriverLicense ? "has license" : "no license";
  String formattedAge = (age < 10) ? "0" + age : String.valueOf(age);
  return String.format("Person [name=%10s | age=%02s | height=%2d | %s]", name, formattedAge, height, licenseStatus);
}

}
