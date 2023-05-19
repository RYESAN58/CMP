import java.util.Scanner;
import java.util.ArrayList;

public class NumScrambler2 {
   public static void scrambleNums(ArrayList<Integer> remainNums,
                                   ArrayList<Integer> scramNums) {
      ArrayList<Integer> tmpRemainNums;
      int tmpRemovedNum;
      int i;

      if (remainNums.size() == 0) {
         System.out.print(scramNums.get(0));
         System.out.print(scramNums.get(1));
         System.out.println(scramNums.get(2));
      }
      else {
         for (i = remainNums.size() - 1; i >= 0; --i) { // New: This line changed
            tmpRemainNums = new ArrayList<Integer>(remainNums);
            tmpRemovedNum = tmpRemainNums.remove(i);
            scramNums.add(tmpRemovedNum);
            scrambleNums(tmpRemainNums, scramNums);
            scramNums.remove(scramNums.size() - 1);
         }
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Integer> numsToScramble = new ArrayList<Integer>();
      ArrayList<Integer> resultNums = new ArrayList<Integer>();

      numsToScramble.add(0);
      numsToScramble.add(7);
      numsToScramble.add(9);

      scrambleNums(numsToScramble, resultNums);
   }
}