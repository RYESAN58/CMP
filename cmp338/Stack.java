
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
    if(top == A.length){
      reSize();
    }
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
  private void reSize(){
    int[] B = new int [A.length*2];
    for(int i = 0; i < A.length ; i++)
      B[i] = A[i];
    A = B;
  } 
  

  
  public static void main(String[] args) {

  }
}