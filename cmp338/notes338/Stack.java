package cmp338.notes338;

public class Stack{
  private int top = -1;
  private int[] a = new int[1];

  public void push(int x){
    top++;
    if(top == a.length){
      this.resize();
    }
    a[top] =  x;

  }
  public void resize(){
    int x = a.length * 2;
    int[] temp = a;
    a = new int[x];

    for(int i = 0; i < top; i++){
      a[i] = temp[i];
    }

    System.out.println("resized array!");
  }

  public int top(){
    return a[top];
  }

  public void pop(){
    top--;
  }

  public boolean isEmpty(){
    if(top < 0){
      return true;
    }

    return false;
  }  
  public void print(){
    for(int i =0; i <= top; i++){
      System.out.print(a[i]);
    }
    System.out.println("");
  }  
  
    public static void main(String[] args) {
      Stack firstStck = new Stack();
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
    }
  }