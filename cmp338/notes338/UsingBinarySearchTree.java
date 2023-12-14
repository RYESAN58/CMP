package cmp338.notes338;

public class UsingBinarySearchTree {
  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();

    int [] x = {10, 5 , 16, 20, 400 , 24, 80 , 6 , 34, 123, 75, 84, 12, 45, 67, 44, 56, 78, 99, 122, 52};

    for( int i = 0; i < x.length; i++){
      bst.insert(x[i]);
    }

    System.out.print("min =");     bst.mininum();
    System.out.print("Max =");     bst.maximum();
    System.out.println("sum =" + bst.sum());
    System.out.println("Height =" + bst.height());
    System.out.println("count =" + bst.count());
    bst.balance();
    
    System.out.println("Height =" + bst.height());
    bst.printInOrder();
  }
}
