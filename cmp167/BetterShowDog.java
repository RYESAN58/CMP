public class BetterShowDog extends ShowDog{
  private int numTircks;
  private Trick[] tricks;
  public static final int MAX_TRICKS = 5;
  public BetterShowDog(){
    super("Better Show Dog");
    numTircks = 0;
    tricks = new Trick[MAX_TRICKS];
  }
  BetterShowDog(String name){
    this();
    setName(name);
  }

  BetterShowDog(int numTrophoies, String Besfeature ){
    this();
    super.setNumTrophoies(numTrophoies);
    super.setBestFeature(Besfeature);
  }
  BetterShowDog(String name, double weight, double height, boolean isVaccinated, int age, int numTrophoies, String bestFeature){
    super(name, weight,height,isVaccinated,age,numTrophoies,bestFeature);
    numTircks = 0;
    tricks = new Trick[MAX_TRICKS];
  }
  @Override
  public String toString(){
    return super.toString() + "I am a super better DOg";
  }
  public boolean addTrick(String trickName, int skillLevel){
    if(numTircks < MAX_TRICKS){
      if(trickName != null && skillLevel > 0){
        for(int i = 0; i< numTircks; i++){
          if(tricks[i] != null && trickName.equalsIgnoreCase(tricks[i].name)){
            return false;
          }
        }
      }
      tricks[numTircks++] = new Trick(trickName, skillLevel);
      return true;
    }
    return false;
  }
  public int getNumTricks(){
    return numTircks;
  }

  private class Trick {
    private int skillLevel;
    private String name;
    public Trick(String name, int skillLevel){
      this.name = name;
      this.skillLevel = skillLevel;
    }
  }
}
