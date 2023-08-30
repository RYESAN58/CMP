import java.util.Scanner;

public class PatternTwo {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Please enter a number 1...9 : ");

    int x = scnr.nextInt();
    for(int i = 1; i <= x; i++ ){
      for (int j = (x - i) *2;j > 0; j-- ){
        System.out.print(" ");
      }
      for(int index = i; index >= 1; index--){
        System.out.print(" " + index);
      }
      System.out.println("");
    }
  }
}
