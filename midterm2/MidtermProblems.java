package midterm2;

public class MidtermProblems {
  public static String difference(int a , int b) {
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
    System.out.println(difference(7, 0));
    }
}
