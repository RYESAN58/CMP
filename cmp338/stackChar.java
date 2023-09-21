package cmp338;

public class stackChar {
  private int  top = -1;
  private char[] A;

  public stackChar(int size){
    A = new char[size];
  }
  // isEmpty
  public boolean isEmpty() {
    return top == -1;
  }
  // push
  public  void push(char x) {
    top++;
    A[top] = x;
  }
  // pop
  public void pop() {
    top--;
  }

  // top
  public char top() {
    return A[top];
  }

}
