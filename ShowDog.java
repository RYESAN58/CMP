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

  @Override
  public String toString(){
    String s = super.toString()+ "\nShowDog number of trophies = "+ numTrophoies + "best Feature = " + bestFeature;
    return s;
  }
}
