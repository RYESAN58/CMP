import java.util.Scanner;

public class ChangeConverter {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the number of quarters:  ");
    int quarters = scnr.nextInt();
    System.out.println("Enter the number of dimes:  ");
    int dimes = scnr.nextInt();
    System.out.println("Enter the number of nickels:  ");
    int nickles = scnr.nextInt();
    System.out.println("Enter the number of pennies:  ");
    int pennies = scnr.nextInt();

    System.out.println("You entered:" );
    System.out.println("   "  + quarters +  " quarters" );
    System.out.println("   "  + dimes +  " dimes" );
    System.out.println("   "  + nickles +  " nickels" );
    System.out.println("   "  + pennies +  " pennies" );
    double total = (quarters * .25)+(dimes * .10)+(nickles *.05)+(pennies*.01);
    System.out.println("The total in dollars is $");
    System.out.format("%.2f", total);
    
  }
  
}
