
import java.util.Scanner;

public class Array {
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
    }if (count == 1){
      return 0;
    }
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
  public static double average(int[] arr, int first, int second){
    double count = 0.0;
    double sum = 0.0;
    if((first < 0 || second < 0) || (first > arr.length-1 || second > arr.length-1)){
      return -666.0;
    }
    for(int i = first; i < second+1; i++){
      sum += arr[i];
      count += 1.0;
    }
    return sum / count; 
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
  public static int indexOfFirstMaxValue(int[] arr, int first, int second){
    int[] arr2;
    if((first < 0 || second < 0) || (first > arr.length-1 || second >= arr.length-1)){
      return -1;
    }
    arr2 = new int[second - first];
    for (int i = first; i < second+1; i++){
      arr2[i-first] = arr[i];
      }
    int x = maxValue(arr2);
    if((first < 0 || second < 0) || (first > arr2.length-1 || second >= arr2.length-1)){
      return -1;
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

  public static int[] indexArray(int []arr, int first, int second){
    int[] arr2;
    if((first < 0 || second < 0) || (first > arr.length-1 || second >= arr.length-1)){
      return null;
    }
    arr2 = new int[second - first];
    for (int i = first; i < second+1; i++){
      arr2[i-first] = arr[i];
      }

    return arr2;
  }
  public static int numberOfBelowAverageElements(int[] arr, int first, int last){
    int[] y = indexArray(arr, first, last);
    if (y == null){return -666;};
    double x = average(y);
    int count =0;
    for(int i =0; i < y.length; i++){
      if(y[i] < x){
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
        index++;
      }
    }
    for(int i=0; i< arr.length;i++){
      arr[i] = x[i];
    }
  }
  public static void main(String[] args) { 
    
  }
}