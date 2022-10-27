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

      for(int i = 0; i < 100; i++){
        if(operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("*")){
          break;
        }else{
          System.out.print("the input is invalid and re-prompt the user for the operation again.");
          System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division ");
          operation = scnr.nextLine();
        }
      }
      System.out.println("How many numbers do you want to add?:");
      int total = scnr.nextInt();
      String temp = "";
      for (int i = 0; i < total; i++){
        System.out.print("Please enter a number");
        temp = temp + scnr.next();
      }

      double answer = 0;
      for(int i = 0; i < temp.length(); i++){
        char y = temp.charAt(i);
        double x = (double) (y - '0'); 
        if(operation.equals("+")){
          answer += x;
        }else if(operation.equals("-")){
          answer -= x;
        }else if (operation.equals("*")){
          if(answer == 0){
            answer += x;
          }else{
            answer *= x;
          }
        }else if (operation.equals("/")){
          if(answer == 0){
            answer += x;
          }else{
            answer /= x;
          }
        }
      }
      System.out.print("Result: " + answer);


    }else if(mode.toLowerCase().equals("scientific")){
      System.out.println("The calculator will operate in scientific mode.");
      System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
      operation = scnr.nextLine();

      for(int i = 0; i < 100; i++){
        if(operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("*") || operation.equals("tan") || operation.equals("sin") || operation.equals("cos")){
          break;
        }else{
          System.out.print("the input is invalid and re-prompt the user for the operation again.");
          System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
          operation = scnr.nextLine();
        }
      }
      if(operation == "sin" || operation == "cos" || operation == "tan"){
        System.out.println("Enter a number in radians to find the " + operation);
      }
      System.out.println("How many numbers do you want to add?:");
      int total = scnr.nextInt();
      String temp = "";
      for (int i = 0; i < total; i++){
        temp = scnr.next() + temp;
      }

      double answer = 0;
      for(int i = 0; i < temp.length(); i++){
        char y = temp.charAt(i);
        double x = (double) (y - '0'); 
        if(operation.equals("+")){
          answer += x;
        }else if(operation.equals("-")){
          answer -= x;
        }else if (operation.equals("*")){
          if(answer == 0){
            answer += x;
          }else{
            answer *= x;
          }
        }else if (operation.equals("/")){
          if(answer == 0){
            answer += x;
          }else{
            answer /= x;
          }
        }
      }
      System.out.print("Result: " + answer);
    }

  }
}
