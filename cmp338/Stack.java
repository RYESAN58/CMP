
package cmp338;


public class Stack {
  private int  top = -1;
  private int[] A = new int [8];


  public Stack(int size){
    A = new int[size];
  }
  // isEmpty
  public boolean isEmpty() {
    return top == -1;
  }
  // push
  public  void push(int x) {
    top++;
    A[top] = x;
  }
  // pop
  public void pop() {
    top--;
  }

  // top
  public int top() {
    return A[top];
  }
  

  
  public static void main(String[] args) {

  }
}