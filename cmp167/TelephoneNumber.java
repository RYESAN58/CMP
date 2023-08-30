import java.util.Scanner;

public class TelephoneNumber {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Please enter a telephone number using letters : ");
    String x = scnr.nextLine();
    int count = 0;
    int total = 0;
    for(int i =0; i < x.length(); i++){
      char temp = x.charAt(i);
      if (count == 3){
        System.out.print("-");
        count +=1;
      }
      if (total == 7 ){
        break;
      }
      
      if(temp == ' ' ){
        if(total< 3){
          continue;
        }else{
          count+=1;
        }
      }else if(temp == 'a' || temp == 'b' || temp == 'c' || temp == 'A' || temp == 'B' || temp == 'C'){
        System.out.print(2);
        total+=1;
        count += 1;
      }else if(temp == 'd' || temp == 'e' || temp == 'f' || temp == 'D' || temp == 'E' || temp == 'F'){
        System.out.print(3);
        count += 1;
        total+=1;
      }else if(temp == 'g' || temp == 'h' || temp == 'i' || temp == 'G' || temp == 'H' || temp == 'I'){
        System.out.print(4);
        count+=1;
        total+=1;
      }else if(temp == 'j' || temp == 'k' || temp == 'l' ||temp == 'J' || temp == 'K' || temp == 'L'){
        System.out.print(5);
        count += 1;
        total+=1;
      }else if(temp == 'm' || temp == 'n' || temp == 'o' || temp == 'M' || temp == 'N' || temp == 'O'){
        System.out.print(6);
        count += 1;
        total+=1;
      }else if(temp == 'p' || temp == 'q' || temp == 'r'|| temp == 's' || temp == 'P' || temp == 'Q' || temp == 'R' || temp == 'S'){
        System.out.print(7);
        count += 1;
        total+=1;
      }else if(temp == 't' || temp == 'u' || temp == 'v' || temp == 'T' || temp == 'U' || temp == 'V'){
        System.out.print(8);
        count += 1;
        total+=1;
      }else if(temp == 'w' || temp == 'x' || temp == 'y' || temp == 'z' || temp == 'W' || temp == 'X' || temp == 'Y' || temp == 'Z'){
        System.out.print(9);
        count += 1;
        total+=1;
      }
    }
    System.out.println("");
  }
}
