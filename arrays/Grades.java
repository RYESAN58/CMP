// package arrays;
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
  public static int maxValue(int[] grades){
    int count = 0;
    for(int i =0; i < grades.length; i++){
      if (i == 0){
        count = grades[i];
      }else if (grades[i] > count){
        count = grades[i];
      }
    }
    System.out.println("Number Of Grades = " + count);
    return count;
  }
  public static int maxValue(int[] grades, int firstIndex, int secondIndex){
    int count = 0;
    if(firstIndex < 0 || secondIndex < 0 || firstIndex > grades.length || secondIndex > grades.length || secondIndex < firstIndex){
      return -666;
    }
    for(int i =firstIndex; i <= secondIndex; i++){
      if (i == 0){
        count = grades[i];
      }else if (grades[i] > count){
        count = grades[i];
      }
    }
    System.out.println("Number Of Grades = " + count);
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
    System.out.println("Minimum Grade = " + count);
    return count;
  }
  public static int minValue(int[] grades){
    int count = 0;
    for(int i =0; i < grades.length; i++){
      if (i == 0){
        count = grades[i];
      }else if (grades[i] < count){
        count = grades[i];
      }
    }
    return count;
  }
  public static int minValue(int[] grades, int firstIndex, int secondIndex){
    int count = 0;
    if(firstIndex < 0 || secondIndex < 0 || firstIndex > grades.length || secondIndex > grades.length || secondIndex < firstIndex){
      return -666;
    }
    for(int i =firstIndex; i <= secondIndex; i++){
      if (i == 0){
        count = grades[i];
      }else if (grades[i] < count){
        count = grades[i];
      }
    }
    return count;
  }
  public static int sum(int[] arr){
    int x = 0;
    for(int i = 0; i< arr.length; ++i){
      x += arr[i];
    }
    return x;
}
  public static int sum(int[] arr, int firstIndex, int secondIndex){
    int x = 0;
    if(firstIndex < 0 || secondIndex < 0 || firstIndex > arr.length || secondIndex > arr.length || secondIndex < firstIndex){
      return -666;
    }
    if (firstIndex <= secondIndex){
      for(int i =firstIndex; i <= secondIndex; i++){
        x += arr[i];
      }
    }
    return x;
}
  public static double average(int[] arr){
    double x = 0.00;
    int count = 0;
    int sum = 0;
    for (int i = 0; i < arr.length; i++){
      count+=1;
      sum+= arr[i];
    }
    double dsum = sum;
    double dcount = count;
    System.out.println(dcount+ " " + dsum);
    x = dsum/dcount;
    return x;
  }
  public static int indexOfFirstMaxValue(int[] arr){
    int x = maxValue(arr);
    for (int i = 0; i < arr.length; i++){
      if(arr[i] == x){
        return i;
      }
    }
    return x;
  }
  public static int indexOfFirstMinValue(int[] arr){
    int x = minValue(arr);
    for (int i = 0; i < arr.length; i++){
      if(arr[i] == x){
        return i;
      }
    }
    return x;
  }
  



  public static void main(String[] args) {    
    // while(scnr.hasNextInt()){
    //   int[] neqArr = new int[10000];
    //   for(int i =0; i < neqArr.length; i++){
    //     System.out.println("Enter a grade : ");
    //     neqArr[i] = scnr.nextInt();
    //     if (neqArr[i] < 0){
    //       break;
    //     }
    //   }
    //   System.out.println("");
    // }
    int[] x = {1,2,3};

    System.out.print(indexOfFirstMaxValue(x));
  }
}
