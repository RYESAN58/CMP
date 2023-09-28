package cmp338;

public class DealingWithLinkedList {
  public static void main(String[] args) {
    Node n1 = new Node();
    n1.x = 8;
    Node n2 = new Node();
    n2.x =4;
    n2.next = n1;
    Node n3 = new Node();
    n3.next = n2;
    n3.next.next = n1;
    n3.next.next.next = n3;
    n2.next.next.next.next.x=7;
  }

}
