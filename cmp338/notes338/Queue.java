package cmp338.notes338;

public class Queue {
  Node front =  null;
  Node back = null;
  // enqueue
  public void enqueue(int x){
    if(isEmpty()){
      back = new Node(x, null);
      front = back.next;
    }else{
      back.next = new Node(x, null);
      back = back.next;
    }
  }
  // dequeue
  public void dequeue(){
    front = front.next;
  }
  // front
  public int front(){
    return front.x;
  }
  // isEmpty
  public boolean isEmpty(){
    return (front == null);
  }
}
