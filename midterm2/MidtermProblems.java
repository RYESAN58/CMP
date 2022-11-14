package midterm2;

public class MidtermProblems {
  public static String differnce(int a , int b) {
    int x = a-b;
    if (x > 0){
      return "a is bigger by " + x;
    }else if (x < 0){
      return "b is bigger by " + x * -1;
    }else{
      return "EQUAL";
    }
  }
  public static void main(String[] args) {
    System.out.println(differnce(7, 0));
    }
}
