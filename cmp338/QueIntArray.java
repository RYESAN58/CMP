package cmp338;

public class QueIntArray {
  private int[] A = new int[80000000];
  private int front = 0;
  private int back= -1;
  private int size = 0 ;


  public void enque(int item){
    if (size == A.length)
    back = (back +1)% A.length;
  }
}
