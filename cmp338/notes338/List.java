package cmp338.notes338;

public class List {
  private Node head = new Node(Integer.MIN_VALUE, new Node(Integer.MAX_VALUE, null));
  private Node prev = head;

  // insert insert at any place in the list
  private void insertAt(int index, int x){
    setCurrent(index);
    insertBefore(x);
  }

  // inserBefore
  private void insertBefore(int x){
    prev.next = new Node(x, prev.next);
  }
    // InsertAfter
  private void insertAfter(int x){
    prev = prev.next;
    insertBefore(x);
  }

  public void setCurrent(int index){
    prev = head;
    for( int i =0 ; i < index; i++){
      prev = prev.next;
    }
  }
  // removes single item from the list
  public void remove(int index){
    setCurrent(index);
    prev.next = prev.next.next;
  }
  // search search fr an item on the list
  public int search(int y){
    setCurrent(0);
    while(prev.next != null){
      if(prev.next.x == y){
        return prev.next.x;
      } else{
          prev = prev.next;
        }
      }
    return 0;
  }
  // isEmpty
  public boolean isEmpty(){
    return head.next == null;
  }


  // sort/balance
  public void insertInOrder(int value){
    prev = head;
    while(value > prev.next.x ){
      prev = prev.next;
    }
    insertBefore(value);
  }

  public void print(){
    setCurrent(0);
    Node curr = prev.next;
    while(curr.next != null){
      System.out.println(curr.x);
      curr = curr.next;
    }
    System.out.println("");
  }
  public static void main(String[] args) {
    List sc = new List();

    // sc.insertBefore(0);
    // sc.insertBefore(6);
    // sc.insertBefore(8);
    // sc.insertBefore(4);
    // sc.insertAfter(44);
    // sc.insertAfter(4994);
    // sc.insertAt(2, 19);

    sc.insertInOrder(0);
    sc.insertInOrder(33);
    sc.insertInOrder(16);
    sc.insertInOrder(333);
    sc.insertInOrder(11);
    sc.insertInOrder(12);
    sc.insertInOrder(2);
    sc.print();
  }
}
