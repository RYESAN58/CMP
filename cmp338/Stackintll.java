package cmp338;

public class Stackintll {
  private Node top = null;

  public void push(int item){
    new Node(item, top);
  }

  public void pop(){
    top = top.next;
  }

  public int top(){
    return top.x;
  }
  public boolean isEmpty(){
    return top == null;
  }


}
