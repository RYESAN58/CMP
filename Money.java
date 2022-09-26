import java.util.Scanner;

public class Money {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter number of Jamaican Dollars :");
    int jamaican = scnr.nextInt();
    System.out.println("Enter number of Dominican Pesos :");
    int dominican = scnr.nextInt();
    System.out.println("Enter number of Cuban Pesos :");
    int cuban = scnr.nextInt();

    double dollar = (jamaican * 0.0069)+(dominican * 0.017)+ (cuban * .042);
    System.out.print("US Dollars = $");
    System.out.printf( "%.2f\n" , dollar );
  }
}
