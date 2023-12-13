package cmp338.notes338;

public class Queueint {
  int[] arr = new int[1];
  int back = -1;
  // enqueue
  public void enqueue(int x){
    back++;
    if(back == arr.length){
      this.reSize();
    }
    arr[back] = x;
  }
  // dequeue
  public void dequeue(){
    for(int i =0; i< back; i++){
      arr[i] = arr[i+1];
    }
    back --;
  }
  // front
  public int front(){
    return arr[0];
  }
  // isEmpty
  public boolean isEmpty(){
    return (back == -1);
  }
  public void reSize(){
    int x = arr.length * 2;
    int[] temp = arr;
    arr = new int[x];

    for(int i = 0; i < back; i++){
      arr[i] = temp[i];
    }

    System.out.println("resized array!");
  }

  public void print(){
    for(int i =0; i <= back; i++){
      System.out.print("["+arr[i]+"]");
    }
    System.out.println("");
  }  

  public static void main(String[] args) {
    
    Queueint ry = new Queueint();
    ry.enqueue(0);
    ry.enqueue(6);
    ry.enqueue(99);
    ry.print();
    System.out.println("current front "+ry.front());
    ry.dequeue();
    System.out.println("current front "+ry.front());
    ry.print();
  }
}
