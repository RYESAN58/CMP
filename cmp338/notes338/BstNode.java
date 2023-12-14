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


  public static void main(String[] args) {
    BstNode bm = new BstNode(50);
    bm.insert(8);
    bm.insert(44);
    bm.insert(68);
    bm.insert(4);
    bm.insert(32);
    bm.insert(87);
    bm.insert(53);
    bm.insert(29);
    bm.insert(71);
    bm.insert(1);
    bm.insert(93);
    bm.insert(57);
    bm.insert(25);
    bm.insert(83);
    bm.insert(14);
    bm.insert(46);
    bm.insert(75);
    bm.insert(34);
    bm.insert(60);
    bm.insert(20);
    bm.insert(91);
    bm.insert(49);
    bm.insert(66);
    bm.insert(12);
    bm.insert(37);
    bm.insert(78);
    bm.insert(22);
    bm.insert(55);
    bm.insert(88);
    bm.insert(17);
    bm.insert(42);
    bm.insert(96);
    bm.insert(39);
    bm.insert(63);
    bm.insert(24);
    bm.insert(81);
    bm.insert(47);
    bm.insert(70);
    bm.insert(31);
    bm.insert(54);
    bm.insert(89);
    bm.insert(26);

    bm.printInOrder();
    System.out.println(bm.search(17));
    System.out.println(bm.count());
  }
}
