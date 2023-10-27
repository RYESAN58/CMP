package cmp338;

public class NodeList {
  private Node tail = new Node(0, null);
  private Node head = new Node(0, tail);
  private Node curr = new Node(0, null);
  private Node prev = new Node(0, null);
  



  public void insertBefore (int value){
    prev.next = new Node(0, prev.next);
  }


  public void inserAfter (int value){
    prev = prev.next;
    insertBefore(value) ;
  }
}
