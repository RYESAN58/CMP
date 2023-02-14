

public class tester {
  public static void main(String[] args) {
    Dog d1 = new Dog();
    Dog d2 = new Dog();
    Dog d3 = new Dog();
    Dog d4 = new Dog();
    Dog d5 = new Dog();
    Dog d7 = new Dog("Mike", 50.12, 32.1, true, 7);
    Dog d8 = new Dog("Mike", 50.12, 32.1, true, 7);

    Dog [] doggies = {d1,d2,d3,d4,d5};
    System.out.println("Default Values");
    for(int i = 0; i < doggies.length; i++){
      System.out.println(doggies[i].getName());
    }

    d1.setName("Maze");
    d2.setName("Drake");
    d3.setName("Ryan");
    d4.setName("Scooby");
    d5.setName("Yerrrr");
    for(int i = 0; i < doggies.length; i++){
      System.out.println(doggies[i].getName());
      System.out.println(d8.equals(d7));
    }
    System.out.println(d7.toString());
  }
}
