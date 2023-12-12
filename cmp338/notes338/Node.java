package cmp338.notes338;

public class Node {

  public int x;
  
  Node next;

  public Node(int x, Node next){
    this.x = x;
    this.next = next;
  }
  public static void main(String[] args) {
    Node firstNode = new Node(11, null);
    Node secondNode = new Node(1133 , firstNode);
    System.out.println(secondNode.next.x);
  }
}
