import java.util.Arrays;

public class Movie {
  private String movieName;
  private int numMinutes;
  private boolean isKidFriendly;
  private int numCastMembers;
  private String[] castMembers;

  public Movie(){
    this.movieName = "Flick";
    this.numMinutes = 0;
    this.isKidFriendly = false;
    this.castMembers = new String[10];
    this.numCastMembers = 0;
    
  }

  public Movie(String s, int x, boolean b, String[] y){
    this.movieName = s;
    this.numMinutes = x;
    this.isKidFriendly = b;
    this.castMembers = y;
    this.numCastMembers = getCastTotal();
  }
  public void setNumMinutes(int x){
    numMinutes = x;
  }
  public void setMovieName(String s){
    movieName = s;
  }
  public void setIsKidFriendly(boolean b){
    isKidFriendly = b;
  }
  public String getMovieName(){
    return this.movieName;
  }
  public int getNumMinutes(){
    return this.numMinutes;
  }
  public int getNumCastMembers(){
    return numCastMembers;
  }
  public boolean getIsKidFriendly(){
    return this.isKidFriendly;
  }
  public String[] getCastMembers(){
    return Arrays.copyOf(castMembers, castMembers.length);
  }
  public int getCastTotal(){
    int x = 0;
    if(castMembers.length > 0){
      for(int i = 0; i < castMembers.length; i++){
        if(castMembers[i] != null){
          x++;
        }
      }
    }
    return x;
  }
  public boolean replaceCastMember(int index, String castMemberName){
    if(castMembers[0] == null){
      return false;
    }
    if((index < 0) || (index > castMembers.length-1)){
      return false; 
    }else{
      castMembers[index] = castMemberName;
      return true;
    }
  } 

  public boolean doArraysMatch(String [] arr1, String [] arr2){
    if(arr1 == null && arr2 == null){
      return true;
    }else if((arr1 == null)||(arr2 == null)) {
			return false;
    }else if (arr1.length != arr2.length){
      return false;
    }
    for(int i = 0; i < arr1.length; i++){
      if(arr1[i] != arr2[i]){
        return false;
      }
    }
    return true;
  }
  public boolean isKidFriendly(){
    return isKidFriendly;
  }
  public String getCastMemberNamesAsString(){
    String s = "";
    if((castMembers.length == 0) || castMembers == null){
      return "none";
    }else{
      for(int i = 0; i < castMembers.length; i++){
        if(castMembers[i] == null){
          return "none";
        }
        if(i == castMembers.length-1){
          s = s + castMembers[i];
        }else{
          s = s + castMembers[i] + ", ";
        }
      }
    }
    return s;
  }

  public String isIt(){
    if(isKidFriendly()){
      return "is kid friendly";
    }else{
      return "not kid friendly";
    }
  }

  public String spaceCreator(){
    int x = 20 - movieName.length();
    String s = "";
    if(movieName.length() < 20){
      for(int i = 0; i < x; i++){
        s = s + " ";
      }
    }
    return s;
  }
  public String placeZero(int x){
    String s = "";
    if(x < 99){
      s = "0" + x;
      return s;
    }else{
      s = x + "";
      return s;
    }
  }

  public String toString(){
    return "Movie: [ Minutes " + placeZero(getNumMinutes()) +" | Movie Name: " + spaceCreator() + getMovieName() +" | " + isIt() + " | " + "Number of Cast Members: " + getNumCastMembers() + " | " + "Cast Members: " + getCastMemberNamesAsString() +" ]";
  }
  public static void main(String[] args) {
    
  }
}
