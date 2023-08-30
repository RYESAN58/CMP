import java.util.Scanner;
import java.lang.Math;
public class CircleSphere {  
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter radius:");

    
    double radius  = scnr.nextDouble();
    
    double circleCircumference = Math.PI * 2 * radius;
    double circleArea = (Math.pow(radius, 2.0))* Math.PI;
    double sphereArea = Math.pow(radius , 2.0) * (4 * Math.PI );
    double sphereVolume = Math.pow(radius, 3.0) * ((4.0/3.0) * Math.PI);

    System.out.println("Circle Circumference = " + circleCircumference);
    System.out.println("Circle Area = " + circleArea);
    System.out.println("Sphere Area = " + sphereArea);
    System.out.println("Sphere Volume = " + sphereVolume);
  }
}
