public class Person {
  
    private String name;
    private double weight;
    private double height;
    private int age;
    private Dog [] doggies;
    private int numDogs;

    public Person(){
      name = "Doe";
      weight = 0;
      height = 0;
      age = 0;
      doggies = new Dog[5];
      numDogs = 0;
    }
    public Person(String name, double weight, double height, int age, Dog [] dogs){
      this();
      this.name = name;
      this.weight = weight;
      this.height = height;
      this.age = age;
      copyIncomingArrayIntoMemberDoggiesArray(dogs);
    }

    private void copyIncomingArrayIntoMemberDoggiesArray(Dog[] dogs){
      int len = 0;
      if(doggies.length > dogs.length){
        len = dogs.length;
      }else{
        len = doggies.length;
      }for(int i = 0; i < len; i++){
        doggies[i] = dogs[i];
        numDogs ++;
      }
    }
}
