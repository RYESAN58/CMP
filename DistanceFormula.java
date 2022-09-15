import java.util.Scanner;
import java.lang.Math;

public class DistanceFormula {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Coordinates for P1");
    System.out.println("Enter X1:");
    double x1  = scnr.nextDouble();
    System.out.println("Enter Y1:");
    double y1  = scnr.nextDouble();
    System.out.println("Coordinates for P2");
    System.out.println("Enter X1:");
    double x2  = scnr.nextDouble();
    System.out.println("Enter Y2:");
    double y2  = scnr.nextDouble();

    double dist = Math.sqrt(Math.pow((x2-x1), 2.0)+ Math.pow((y2-y1), 2.0));

    System.out.println("Distance between P1 and P2 = " + dist);
  }
}
