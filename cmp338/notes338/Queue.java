package cmp338.notes338;

public class Queue {
  Node front =  null;
  Node back = null;
  // enqueue
  public void enqueue(int x){
    if(isEmpty()){
      back = new Node(x, null);
      front = back;
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

  public void print(){
    Node curr = front;
    while(curr != null){
      System.out.println(curr.x);
      curr = curr.next;
    }
    System.out.println("");
  }

  public static void main(String[] args) {
    Queue ry = new Queue();

    ry.enqueue(0);
    ry.enqueue(6);
    ry.enqueue(99);
    System.out.println("current front "+ry.front());
    ry.dequeue();
    System.out.println("current front "+ry.front());
    ry.print();
  }
}
