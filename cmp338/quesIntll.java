package cmp338;

public class quesIntll {
  private Node front = null;
  private Node back = null;

  public void enque(int item){
    if(isEmpty()){
      back = new Node(item, null);
      front = back;
    }else{
      back.next = new Node(item, null);
      back = back.next;
    }
  }
  public void deque(){
    front = front.next;
  }

  public int front(){
    return front.x;
  }

  public boolean isEmpty(){
    return (front ==null); 
  }
}

getValue{

  total = 0;
  leftVal = 0;
  rightVal = 0;

if(left != null){
  leftval = left.getValue; 

}if (right!= null){
  rightVal = right.getValue
}

return value += total;
}