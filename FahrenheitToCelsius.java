import java.util.Scanner;

public class FahrenheitToCelsius {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the Fahrenheit Temperature as a decimal:");
    double Fahrenheit = scnr.nextDouble();
    double celcuis; 

    celcuis = (Fahrenheit-32) * 5/9;
    System.out.print(Fahrenheit);
    System.out.print(" F = ");
    System.out.format("%.1f", celcuis);
    System.out.print(" C");
  }
}
