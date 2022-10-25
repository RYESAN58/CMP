package projext1;
import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the calculator mode: Standard/Scientific?");
    String mode = scnr.nextLine();
    String operation;
    if(mode.toLowerCase().equals("standard")){
      System.out.println("The calculator will operate in standard mode.");
      System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
      operation = scnr.nextLine();
      while(operation != "+" ||operation != "-"|| operation != "*" || operation != "/");
      System.out.print("the input is invalid and re-prompt the user for the operation again.");
      System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
      operation = scnr.nextLine();
    }else if(mode.toLowerCase().equals("scientific")){
      System.out.println("The calculator will operate in Scientific mode.");
      System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
      operation = scnr.nextLine();
      while(operation != "+" ||operation != "-"|| operation != "*" || operation != "/");
      System.out.print("the input is invalid and re-prompt the user for the operation again.");
      System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
      operation = scnr.nextLine();
    }

  }
}
