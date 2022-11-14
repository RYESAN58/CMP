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
  public static String odds(int a) {
    String x = "";
    if (a%2 == 0){
      a -=1;
    }else if(a < 0){
      return "NONE";
      }
    for(int i = 0; i < a+1; i++){
      if (i % 2 != 0){
        x = x + i;
        if (i != a){
          x = x + ",";
        }
      }
    }
    return x;
  }
  public static void main(String[] args) {
    System.out.println(odds(8));
    }
}
