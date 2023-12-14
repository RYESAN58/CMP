package cmp338.notes338;

public class BstNode {
  private BstNode left = null;
  private BstNode right = null;
  private int x;


  public BstNode(int value){
    this.x = value;
  }

  public void mininum(){
    if (left!= null)   left.mininum();
    else System.out.println(x);
  }

  public void maximum(){
    if(right!= null)   right.maximum();
    else System.out.println(x);
  }

  public void printInOrder(){
    if(left != null) left.printInOrder();
    System.out.println(x);
    if(right != null) right.printInOrder();
  }

  public void InOrder(){
    if(left != null) left.printInOrder();
    A[i++] = x;
    if(right != null) right.printInOrder();
  }



  public void printReverseOrder(){
    if(right != null) right.printReverseOrder();
    System.out.println(x);
    if(left != null) left.printReverseOrder();
  }

  public int count(){
    int rc = 0;
    int lc = 0;
    if(left != null){
      lc += left.count();
    }
    if (right != null){
      rc += right.count();
    }
    return rc + lc +1;
  }


  public int count2(){
    int count = 0;
    if(left != null){
      count += left.count2();
    }
    if (right != null){
      count += right.count();
    }
    return count;
  }

  public int sum(){
    int sum = x;
    if(left != null){
      sum += left.sum();
    }
    if(right != null){
      sum += right.sum();
    }
    return sum;
  }

  public int height(){
    int lh = 0;
    int rh = 0;
    if(left != null){
      lh  = left.height();
    }
    if(right != null){
      rh = right.height();
    }
    return Math.max(lh, rh) +1;
  }

  public void insert(int value){
    if (value < x) {
      if(left != null){
        left.insert(value);
      }else{
        left = new BstNode(value);
      }
    }
    if (value > x) {
      if(right != null){
        right.insert(value);
    }else{
      right = new BstNode(value);
      }
    }
  }

  public int search(int val){
    if (x == val)                    return val;
    
    if((val < x) && (left != null))  return left.search(val);
    
    if((val > x) && (right != null)) return right.search(val);

    return -1;
  }



}
