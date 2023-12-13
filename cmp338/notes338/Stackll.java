package cmp338.notes338;

public class Stackll {
  private Node top = null;
  // private int[] a = new int[1];

  public void push(int item){
    top = new Node(item, top);
  }
  // public void resize(){
  //   int x = a.length * 2;
  //   int[] temp = a;
  //   a = new int[x];

  //   for(int i = 0; i < top; i++){
  //     a[i] = temp[i];
  //   }

  //   System.out.println("resized array!");
  // }

  public int top(){
    return top.x;
  }

  public void pop(){
    top = top.next;
  }

  public boolean isEmpty(){
    if(top == null){
      return true;
    }

    return false;
  }  
  public void print(){
    Node curr = top;
    while(curr != null){
      System.out.println(curr.x);
      curr = curr.next;
    }
    System.out.println("");
  }

  
    public static void main(String[] args) {
      Stackll firstStck = new Stackll();
      firstStck.push(0);
      firstStck.push(55);
      firstStck.push(66);
      firstStck.push(0);
      firstStck.push(55);
      firstStck.push(66);
      firstStck.push(0);
      firstStck.push(55);
      firstStck.push(66);
      firstStck.push(0);
      firstStck.push(55);
      firstStck.push(66);
      firstStck.print();
    }
}
