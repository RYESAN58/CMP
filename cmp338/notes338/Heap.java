package cmp338.notes338;

public class Heap {
  private int [] value;
  int last = -1;
  final int root =  0;



  public void sort (int[] A){
    value = A;

    for(int i = 0; i < value.length; i++){
      insert();
    }
    for(int i = 0; i < value.length; i++){
      remove();
    }
  }


  public void insert(){
    last ++;
    heapifyUpward(last);
  }
  
  public void insert(int x){
    last ++;
    if(last == value.length)    resize();
    value[last] = x;
    heapifyUpward(last);
  }

  private void heapifyUpward(int node){
    if ((node != root) && (value[node] > value[parent(node)])){
        swap(node , parent(node));
        heapifyUpward(parent(node));
    }
  }

  private int parent(int node){
    return( node -1) /2;
  }
  private void heapifyDownward(int node){
    if(right(node) <= last){
      if(value[left(node)] >value[right(node)]){
        if(value[node] < value[left(node)]){
          swap(node, left(node));
          heapifyDownward(left(node));
        }
      }
      else{
        if(value[node] < value[right(node)]){
          swap(node, right(node));
          heapifyDownward(right(node));
        }
      }
    }else{
      if(left(node) == last){
        if(value[node] < value[left(node)]){
          swap(node, left(node));
          heapifyDownward(left(node));
        }
      }
    }
  }

  public int right( int node){
    return 2* node + 2;
  }
  public int left( int node){
    return 2* node + 1;
  }

  private void swap(int index1, int index2){
    int temp = value[index1];
    value[index1] = value[index2];
    value[index2] = temp;
  }

    private void resize(){
      int[] B = new int[2*value.length];
      for (int i = 0; i < value.length; i++){
        B[i] = value[i];
      }
      value = B;
  }


  public void remove(){
    swap(root , last);
    last--;
    heapifyDownward(root);
  }


}
