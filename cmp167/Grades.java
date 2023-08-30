import java.util.Scanner;

public class Grades {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int i;
    int a=0;
    int aminus=0;
    int bplus=0;
    int b = 0;
    int bminus=0;
    int cplus=0;
    int c=0;
    int cminus=0;
    int d = 0;
    int f = 0;

    
    
    int x;
    int count = 0;
    for(i =0; i <= 66; i++){
      System.out.println("Enter a grade: ");
      x = scnr.nextInt();
      if (x >= 93){
        a = a + 1;
        count+=1;
      }else if(x >= 90){
        aminus = aminus+ 1;
        count+=1;
      }else if(x >= 87){
        bplus = bplus + 1;
        count+=1;
      }else if(x >= 83){
        b = b + 1;
        count+=1;
      }else if(x >= 80){
        bminus = bminus + 1;
        count+=1;
      }else if(x >=77){
        cplus =  cplus + 1;
        count+=1;
      }else if(x >= 73){
        c = c + 1;
        count+=1;
      }else if(x >= 70){
        cminus =  cminus + 1;
        count+=1;
      }else if(x >= 60){
        d = d + 1;
        count+=1;
      }else if(x > 0){
        f = f+1;
        count+=1;
      }else{
        break;
      }
    }
    System.out.println("Total number of grades = " +count);
    System.out.println("Number of A's  = "+ a);
    System.out.println("Number of A-'s = " + aminus);
    System.out.println("Number of B+'s = " + bplus);
    System.out.println("Number of B's  = " + b);
    System.out.println("Number of B-'s = " + bminus);
    System.out.println("Number of C+'s = "+ cplus);
    System.out.println("Number of C's  = "+ c);
    System.out.println("Number of C-'s = "+ cminus);
    System.out.println("Number of D's  = "+ d);
    System.out.println("Number of F's  = " + f);
  }
}
