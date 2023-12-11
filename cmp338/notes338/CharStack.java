package cmp338.notes338;

public class CharStack {
  private int top = -1;
  private char[] a = new char[1];

  public void push(char x){
    top++;
    if(top == a.length){
      this.resize();
    }
    a[top] =  x;
  }


  public void resize(){
    int x = a.length * 2;
    char[] temp = a;
    a = new char[x];
    for(int i = 0; i < top; i++){
      a[i] = temp[i];
    }
    System.out.println("resized array!");
  }

  public char top(){
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
}
