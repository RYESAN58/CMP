package cmp338;

public class Node {

  public int x;
  
  Node next;

  public Node(int x, Node next){
    this.x = x;
    this.next = next;
  }
  

  public ListNode middleNode(ListNode head) {
    int count = -1;
    int position;
    ListNode curr = head;
    if(head.next == null){return head;}
    while(curr.next != null){
        count++;
        curr = curr.next;
    }
    position = count/2+1;
    count = 0;
    curr = head;
    while(curr.next != null){
        count++;
        curr = curr.next;
        if(count == position){
            return curr;
        }
    }
    return null;
  }
}