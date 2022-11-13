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
  public static void main(String[] args) {
    System.out.println(replaceFirst("", 'K'));
    }
}
