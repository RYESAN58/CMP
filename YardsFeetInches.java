import java.util.Scanner;

public class YardsFeetInches {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter number of inches:");

    System.out.println("");
    int numInches  = scnr.nextInt();
    int numYards = numInches / 36;
    numInches = numInches -(numYards * 36);
    int numFeet = numInches / 24;
    numInches = numInches - (numFeet * 24 );

    System.out.print(numYards + " yards, " + numFeet + " feet, and " + numInches + " inches");

    // 10 yards, 0 feet, and 7 inches.
  }
}
