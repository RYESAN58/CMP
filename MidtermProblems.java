public class MidtermProblems {
    public static String replaceFirst(String s, char c) {
      if(s == null){
        return null;
      }else if(s.length() > 0){
      char x = s.charAt(0);
      s = s.replace(x, c);
      return s;
    }else{
      return "";
    }
  }
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
    System.out.println(difference(0, 0));
    }
}