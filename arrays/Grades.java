package arrays;
import java.util.Scanner;

public class Grades {

  public static int readGrades(int[] grades){
    int count = 0;
    for(int i =0; i < grades.length; i++){
      if (grades[i] < 0){
        return count;
      }else{
        count +=1;
      }
    }
    return count;
  }
  public static int maxGrade(int[] grades){
    int count = 0;
    for(int i =0; i < grades.length; i++){
      if (i == 0){
        count = grades[i];
      }else if (grades[i] > count){
        count = grades[i];
      }
    }
    return count;
  }
  public static int minGrade(int[] grades){
    int count = 0;
    for(int i =0; i < grades.length; i++){
      if (i == 0){
        count = grades[i];
      }else if (grades[i] < count && grades[i] > 0){
        count = grades[i];
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    while(scnr.hasNextInt()){
      int[] neqArr = new int[10000];
      for(int i =0; i < neqArr.length; i++){
        System.out.println("Enter a grade : ");
        neqArr[i] = scnr.nextInt();
        if (neqArr[i] < 0){
          break;
        }
      }
      System.out.println("Number Of Grades = " + readGrades(neqArr));
      System.out.println("Maximum Grade = " + maxGrade(neqArr));
      System.out.println("Minimum Grade = " + minGrade(neqArr));
      System.out.println("");
    }
  }
}
