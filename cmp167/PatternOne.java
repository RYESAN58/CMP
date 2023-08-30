import java.util.Scanner;

public class PatternOne {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Please enter a number 1...9 : ");

    int x = scnr.nextInt();
    for(int i = 1; i <= x; i++ ){
      for(int index = 1; index <= i; index++){
      System.out.print(index + " ");
      }
      System.out.println("");
    }

    
  }
}
