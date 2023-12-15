package cmp338.notes338;

public class UsingHeaps {
  public static void main(String[] args) {
    Heap heap = new Heap();
    int [] x = {10, 5 , 16, 20, 400 , 24, 80 , 6 , 34, 123, 75, 84, 12, 45, 67, 44, 56, 78, 99, 122, 52};

    heap.sort(x);

    for(int i = 0; i< x.length; i++)
      System.out.println(x[i]);  
  }
}
