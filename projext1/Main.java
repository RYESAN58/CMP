package projext1;
import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    String program = "y";
    while(program.equals("y")){
      System.out.println("Enter the calculator mode: Standard/Scientific?");
      String mode = scnr.next();
      String operation;
      // STANDARD!!!
      if(mode.toLowerCase().equals("standard")){
        String operand;
        System.out.println("The calculator will operate in standard mode.");
        System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
        operation = scnr.next();

        for(int i = 0; i < 100; i++){
          if(operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("*")){
            break;
          }else{
            System.out.println("Invalid operator " + operation);
            System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
            operation = scnr.next();
          }
        }
        if(operation.equals("+")){
          operand = "add";
        }else if(operation.equals("-")){
          operand = "subtract";
        }else if(operation.equals("*")){
          operand = "multiply";
        }else{
          operand = "divide";
        }
        System.out.println("How many numbers do you want to "+ operand +"?");
        int total = scnr.nextInt();
        double temp;
        double answer = 0;
        int count = 0;
        System.out.println("Enter " + total + " numbers");
        for (int i = 0; i < total; i++){
          temp =scnr.nextDouble();
          if(operation.equals("+")){
            if(answer == 0){
              answer = temp;
            }else{
              answer = answer + temp;
            }
          }else if(operation.equals("-")){
            if(answer == 0){
              answer = temp;
            }else{
              answer = answer - temp;
            }
          }else if (operation.equals("*")){
            if(answer == 0){
              answer = temp;
            }else{
              answer *= temp;
            }
          }else if (operation.equals("/")){
            if(answer == 0 && count == 0){
              answer = temp;
              count += 1;
            }else{
              answer = answer / temp;
              count += 1;
            }
          }
          
        }
        System.out.println("Result: " + answer);
        System.out.println("Do you want to start over? (Y/N)");
        program = scnr.next().toLowerCase();

      }
      // SCIENTIFIC 
      else if(mode.toLowerCase().equals("scientific")){
        System.out.println("The calculator will operate in scientific mode.");
        System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
        operation = scnr.next();
        String operand;
        for(int i = 0; i < 100; i++){
          if(operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("*") || operation.equals("tan") || operation.equals("sin") || operation.equals("cos")){
            break;
          }else{
            System.out.println("Invalid operator " + operation);
            System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
            operation = scnr.next();
          }
        }
        int total;
        double temp;
        double answer = 0;
        if(operation.equals("+")){
          operand = "add";
          System.out.println("How many numbers do you want to " + operand + "?");
          total = scnr.nextInt();
          System.out.println("Enter " + total + " numbers");
          for (int i = 0; i < total; i++){
            temp =scnr.nextDouble();
            if(operation.equals("+")){
              if(answer == 0){
                answer = temp;
              }else{
                answer = answer + temp;
              }
            }else if(operation.equals("-")){
              if(answer == 0){
                answer = temp;
              }else{
                answer = answer - temp;
              }
            }else if (operation.equals("*")){
              if(answer == 0){
                answer = temp;
              }else{
                answer *= temp;
              }
            }else if (operation.equals("/")){
              if(answer == 0){
                answer = temp;
              }else{
                answer = answer / temp;
              }
            }
            
          }
        }else if(operation.equals("-")){
          operand = "subtract";
          System.out.println("How many numbers do you want to " + operand + "?");
          total = scnr.nextInt();
          System.out.println("Enter " + total + " numbers");
          for (int i = 0; i < total; i++){
            temp =scnr.nextDouble();
            if(operation.equals("+")){
              if(answer == 0){
                answer = temp;
              }else{
                answer = answer + temp;
              }
            }else if(operation.equals("-")){
              if(answer == 0){
                answer = temp;
              }else{
                answer = answer - temp;
              }
            }else if (operation.equals("*")){
              if(answer == 0){
                answer = temp;
              }else{
                answer *= temp;
              }
            }else if (operation.equals("/")){
              if(answer == 0){
                answer = temp;
              }else{
                answer = answer / temp;
              }
            }
            
          }
        }else if(operation.equals("*")){
          operand = "multiply";
          System.out.println("How many numbers do you want to " + operand + "?");
          total = scnr.nextInt();
          System.out.println("Enter " + total + " numbers");
          for (int i = 0; i < total; i++){
            temp =scnr.nextDouble();
            if(operation.equals("+")){
              if(answer == 0){
                answer = temp;
              }else{
                answer = answer + temp;
              }
            }else if(operation.equals("-")){
              if(answer == 0){
                answer = temp;
              }else{
                answer = answer - temp;
              }
            }else if (operation.equals("*")){
              if(answer == 0){
                answer = temp;
              }else{
                answer *= temp;
              }
            }else if (operation.equals("/")){
              if(answer == 0){
                answer = temp;
              }else{
                answer = answer / temp;
              }
            }
            
          }
        }else if(operation.equals("/")){
          operand = "divide";
          System.out.println("How many numbers do you want to " + operand + "?");
          total = scnr.nextInt();
          System.out.println("Enter " + total + " numbers");
          for (int i = 0; i < total; i++){
            temp =scnr.nextDouble();
            if(operation.equals("+")){
              if(answer == 0){
                answer = temp;
              }else{
                answer = answer + temp;
              }
            }else if(operation.equals("-")){
              if(answer == 0){
                answer = temp;
              }else{
                answer = answer - temp;
              }
            }else if (operation.equals("*")){
              if(answer == 0){
                answer = temp;
              }else{
                answer *= temp;
              }
            }else if (operation.equals("/")){
              if(answer == 0){
                answer = temp;
              }else{
                answer = answer / temp;
              }
            }
            
          }
        }else{
          if (operation.equals("sin") ){
            operand = "sine";
            System.out.println("Enter a number in radians to find the " + operand);
            double radian = scnr.nextDouble();
            answer = Math.sin(radian);
            
          }else if(operation.equals("cos")){
            operand = "cosine";
            System.out.println("Enter a number in radians to find the " + operand);
            double radian = scnr.nextDouble();
            answer = Math.cos(radian);
            
          }else if (operation.equals("tan")){
            operand = "tangent";
            System.out.println("Enter a number in radians to find the " + operand);
            double radian = scnr.nextDouble();
            answer = Math.tan(radian);
            
          }
        }
        System.out.println("Result: " + answer);
        System.out.println("Do you want to start over? (Y/N)");
        program = scnr.next().toLowerCase();
      }
    }
    System.out.println("Goodbye");
  }
}
