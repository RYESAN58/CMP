import java.util.Scanner;


public class hw {
  public static void main(String[] args) {

    Scanner scnr = new Scanner(System.in);
    int firstInt;
    int secondResult;
    int thirdResult;
    int firstResult;
    int secondInt;
    int thirdInt;
    firstInt  = scnr.nextInt();
    secondInt = scnr.nextInt();
    thirdInt = scnr.nextInt();
    firstResult = (firstInt + secondInt) / thirdInt;
    secondResult = (secondInt * thirdInt)/ ( secondInt + firstInt );
    thirdResult = (firstInt * thirdInt) % secondInt;
    System.out.println(firstResult);
    System.out.println(secondResult);
    System.out.println(thirdResult);
    
  }

}
