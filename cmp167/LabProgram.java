import java.util.Scanner; 

public class LabProgram {  
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    String inputMonth;
    int inputDay;
    inputMonth = scnr.next();
    inputDay = scnr.nextInt();
    if (inputMonth.equals("January")) { 
        System.out.print("Winter");
      }
      else if (inputMonth.equals("Febuary")) {
          System.out.println("Winter");
        }
      else if (inputMonth.equals("March")) {
        if (inputDay >= 1 && inputDay <= 19){ 
          System.out.println("Winter");
        }else if (inputDay >= 20 && inputDay <= 31) {
              System.out.println("Spring");
        }
      }else if (inputMonth.equals("April")) {
        System.out.println("Spring");
      }
      
      else if (inputMonth.equals("May")) {
        System.out.println("Spring");
      }
      else if (inputMonth.equals("June")) {
        if (inputDay >= 1 && inputDay <= 19){ 
            System.out.println("Spring");
          }else if (inputDay >= 20 && inputDay <= 30){
            System.out.println("Summer");
          }
        }
      else if (inputMonth.equals("July")) {
        System.out.println("Summer");
      }
      else if (inputMonth.equals("August")){
          System.out.println("Summer");
      }
      else if (inputMonth.equals("September")){
        if (inputDay >= 1 && inputDay <= 21){ 
          System.out.println("Summer");
        }else if (inputDay >= 22 && inputDay <= 30){ 
        System.out.println("Autumn");
      }
    }else if (inputMonth.equals("October")) {
        System.out.println("Autumn");
  }else if (inputMonth.equals("November")){ 
          System.out.println("Autumn");
      }else if (inputMonth.equals("December")) {
        if (inputDay >= 1 && inputDay <= 20){
          System.out.println("Autumn");
        }else if (inputDay >= 21 && inputDay <= 31 ){ 
            System.out.println("Winter");
          }
        }else{ System.out.println("Invalid");}
      }
    }
