import java.util.Scanner;

public class NumberSearch {
   public static void findNumber(int number, int lowVal, int highVal, String indentAmt) {
      int midVal;

      midVal = (highVal + lowVal) / 2;
      System.out.print(indentAmt);
      System.out.print(midVal);

      if (number == midVal) {
         System.out.println(" a");
      }
      else {
         if (number < midVal) {
            System.out.println(" b");
            findNumber(number, lowVal, midVal, indentAmt + " ");
         }
         else {
            System.out.println(" c");
         }
      }

      System.out.println(indentAmt + "d");
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int number;

      number = scnr.nextInt();
      findNumber(number, 0, 14, "");
   }
}	
