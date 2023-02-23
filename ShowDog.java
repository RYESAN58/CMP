public class ShowDog extends Dog {
  private int numTrophoies;
  private String bestFeature;

  public ShowDog(){
    super();
    setName("Show Dog Doe");
    numTrophoies = 0;
    bestFeature = "appearence";
  }
  public ShowDog(int numT, String bestFeature){
    this();
    if(numT> 0){numTrophoies = numT;}
    this.bestFeature = bestFeature;
  }
  public ShowDog(String name,double weight,double height, boolean isVaccinated, int age, int numTrophoies, String bestFeature ){
    super(name, weight,height,isVaccinated,age);
    this.numTrophoies = numTrophoies;
    this.bestFeature = bestFeature;

  }
  public ShowDog( String name){
    super(name);
    numTrophoies = 0;
    bestFeature = "appearance";
  }
  @Override
  public String toString(){
    String s = super.toString()+ "\nShowDog number of trophies = "+ numTrophoies + "best Feature = " + bestFeature;
    return s;
  }
  public void setNumTrophoies(int numTrophoies) {
    this.numTrophoies = numTrophoies;
  }
  public void setBestFeature(String bestFeature) {
    this.bestFeature = bestFeature;
  }
}
