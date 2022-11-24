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
    if(firstIndex < 0 || secondIndex < 0 || firstIndex >= grades.length || secondIndex >= grades.length || secondIndex < firstIndex){
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
    int count = grades[0];
    if(firstIndex < 0 || secondIndex < 0 || firstIndex >= grades.length || secondIndex >= grades.length || secondIndex < firstIndex){
      return -666;
    }
    for(int i =firstIndex; i <= secondIndex; i++){
      if (grades[i] < count){
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
    if(firstIndex < 0 || secondIndex < 0 || firstIndex >= arr.length || secondIndex >= arr.length || secondIndex < firstIndex){
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

  public static int numberOfBelowAverageElements(int[] arr){
    double x = average(arr);
    
    int count =0;
    for(int i =0; i < arr.length; i++){
      if(arr[i] < x){
        count +=1;
      }
    }
    // int value = (int) count;
    return count;
  }

  public static int numberOfAboveAverageElements(int[] arr){
    double x = average(arr);
    int count =0;
    for(int i =0; i < arr.length; i++){
      if(arr[i] > x){
        
        count +=1;
      }
    }
    // int value = (int) count;
    return count;
  }
  public static void rotateElements(int[] arr){
    int temp = arr[arr.length-1];
    for(int i=arr.length-1; i > -1; i--){
      if(i != 0){
        arr[i] = arr[i-1];
      }else{
        arr[i] = temp;
      }
      System.out.println(arr[i]);
    }
  }
  public static void rotateElements(int[] arr, int rotationCount ){
    int[] x = new int[arr.length];
    for(int i =0; i < arr.length; i++){
      if(i + rotationCount <= arr.length-1){
        x[i+rotationCount] = arr[i];
      }else if(i + rotationCount > arr.length-1){
        int y = (i+rotationCount) - (arr.length);
        x[y] = arr[i];
      }
    }
    for(int i =0; i < arr.length; i++){
      arr[i] = x[i];
    }
  }

  public static void reverseArray(int[] arr){
    int[] x = new int[arr.length];
    int index = 0;
    while(index < arr.length-1){
      for(int i=arr.length-1; i > -1; i--){
        x[index] = arr[i];
        // System.out.println(x[index]);
        index++;
      }
    }
    for(int i=0; i< arr.length;i++){
      arr[i] = x[i];
      System.out.print(arr[i]);
    }
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
    int[] x = {45,22,18,89,82,79,15,69,100,55,48,72,16,98,57,75,44,32,21,14,7,16,49,58,72};

    // System.out.print(numberOfBelowAverageElements(x));
    rotateElements(x,6);
  }
}
