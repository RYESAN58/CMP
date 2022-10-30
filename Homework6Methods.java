public class Homework6Methods {
  public static int getMaxOf2Ints(int val1, int val2) {
    if(val1 > val2){
      return val1;
    }else{
      return val2;
    }
  }
  public static int getMinOf2Ints (int val1, int val2) {
    if(val1 < val2){
      return val1;
    }else{
      return val2;
    }
  }
  public static int getMaxOf3Ints(int val1, int val2, int val3) {
    if (val1 > val2  && val1 > val3){
      return val1;
    }else if(val2 > val1 && val2 > val3){
      return val2;
    }else{
      return val3;
    }
  }
  public static int getMedianOf3Ints (int val1, int val2, int val3){
    int x = getMaxOf3Ints(val1, val2, val3);
    int y = printMinOf3Ints(val1, val2, val3);
    int fin = 0;
    if(val1 != x && val1 != y){
      return val1;
    }else if(val2 != x && val2 != y){
      return val2;
    }else{
      return val3;
    }
    
  }
  public static int printMinOf3Ints(int val1, int val2, int val3) {
    if (val1 < val2  && val1 < val3){
      System.out.println("The min is " + val1);
      return val1;
    }else if(val2 < val1 && val2 < val3){
      System.out.println("The min is " + val2);
      return val2;
    }else{
      System.out.println("The min is " + val3);
      return val3;
    }
  }
  public static int getProdOfAllPositiveInts(int x){
    int y=1;
    if (x % 2== 0){
      for(int i = 1; i <= x; i++){
        y*=i;
      }
    }else{
      return 0;
    }
    return y;
  }

  public static void main(String[] args) {
    System.out.println(getProdOfAllPositiveInts(4));
  }
}
