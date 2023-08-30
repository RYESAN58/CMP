import java.util.Scanner;

public class SecondsConverter {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the number of seconds:  ");
    int seconds = scnr.nextInt();

    int hours = seconds / 60 / 60;
    
    int minutes = seconds / 60 % 60;

    int x = seconds - ((minutes * 60) + (hours*60*60));
    System.out.println(seconds + " seconds = " + hours + " hours, " + minutes + " minutes, and " + x + " seconds");
    System.out.println( seconds + " seconds =");
    System.out.format("%02d", hours);
    System.out.print("h:");
    System.out.format("%02d", minutes);
    System.out.print("m:");
    System.out.format("%02d", x);
    System.out.println("s");
  }
}
