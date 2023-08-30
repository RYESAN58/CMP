public class Homework7_1 {
  
  // Problem 1: Fibonacci Sequence
  public static int fib(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      return fib(n - 1) + fib(n - 2);
    }
  }

  // Problem 2: Power of X
  public static int getPowerOfXtoN(int xBase, int nExp) {
    if (nExp == 0) {
      return 1;
    } else {
      return xBase * getPowerOfXtoN(xBase, nExp - 1);
    }
  }

  // Problem 3: Binary Search
  public static int binarySearch(String target, String[] words) {
    return binarySearchHelper(target, words, 0, words.length - 1);
  }

  private static int binarySearchHelper(String target, String[] words, int low, int high) {
    if (low > high) {
      return -1; // target not found
    }

    int mid = (low + high) / 2;
    int compare = target.compareTo(words[mid]);

    if (compare == 0) {
      return mid; // target found at index mid
    } else if (compare < 0) {
      return binarySearchHelper(target, words, low, mid - 1); // search left half
    } else {
      return binarySearchHelper(target, words, mid + 1, high); // search right half
    }
  }

  // Problem 4: Organize Parade
  public static int organizeParade(int paradeLength) {
    if (paradeLength == 1) {
      return 2;
    } else if (paradeLength == 2) {
      return 3;
    } else {
      return organizeParade(paradeLength - 1) + organizeParade(paradeLength - 2);
    }
  }

  // Problem 5: Number of Jars Needed
  public static int numJarsNeeded(int candyCount, int jarCapacity) {
    if (candyCount <= jarCapacity) {
      return 1;
    } else {
      int jarsNeeded = numJarsNeeded(candyCount / 2, jarCapacity);
      if (candyCount % 2 != 0) {
        jarsNeeded++;
      }
      return jarsNeeded;
    }
  }

  public static void main(String[] args) {
    System.out.println(fib(3)); // Output: 2
    System.out.println(getPowerOfXtoN(2, 3)); // Output: 8
    System.out.println(getPowerOfXtoN(-2, 3)); // Output: -8

    String[] words = {"apple", "banana", "cherry", "date", "elderberry"};
    System.out.println(binarySearch("date", words)); // Output: 3
    System.out.println(binarySearch("grape", words)); // Output: -1

    System.out.println(organizeParade(4)); // Output: 6
    System.out.println(numJarsNeeded(10, 2)); // Output: 6
    System.out.println(numJarsNeeded(16, 4)); // Output: 4
  }
}
