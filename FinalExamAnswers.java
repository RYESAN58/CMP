import java.util.Scanner;

public class FinalExamAnswers {
  public static void manipulateString(){
    Scanner scnr = new Scanner(System.in);
    String s;
    s = scnr.nextLine();
    String[] x = s.split(" ");
    String temp;

    System.out.println("Enter a sentence");

    for(int i = 0; i < x.length; i++){
      if (i % 2 == 0){
        x[i] = x[i].toUpperCase();
      }else{
        x[i] = x[i].toLowerCase();
      }
    }
    for(int index = 0; index < x.length; index++){
      if(index < (x.length / 2)){
        temp = x[index];
        x[index] = x[(x.length-1)-index];
        x[(x.length-1)-index] = temp;
      }
    }
    temp = "";
    for(int index = 0; index < x.length; index++){
      temp = temp + x[index];
      if(index != x.length-1){
        temp = temp + " ";
      }
    }
    System.out.print(temp);
  }
  public static void main(String[] args) {

  }
}
