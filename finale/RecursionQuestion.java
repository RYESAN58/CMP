class RecursionQuestion {
  public static int binarySearch(Car[] cars, Car c) {
      System.out.println("Looking for Car: " + c.toString());
      return binarySearchHelper(cars, c, 0, cars.length - 1);
  }

  private static int binarySearchHelper(Car[] cars, Car c, int start, int end) {
      if (start > end) {
          System.out.println("Not Found");
          return -1;
      }

      int mid = (start + end) / 2;
      System.out.println("s=" + start + ", e=" + end + ", mid=" + mid);

      if (cars[mid].equals(c)) {
          System.out.println("FOUND at " + mid);
          return mid;
      }

      if (c.compareTo(cars[mid]) < 0) {
          System.out.println("go left");
          return binarySearchHelper(cars, c, start, mid - 1);
      } else {
          System.out.println("go right");
          return binarySearchHelper(cars, c, mid + 1, end);
      }
  }

  public static void main(String[] args) {
      // Example usage
      Car[] cars = new Car[] {
          new Car(2, 4, new int[]{2, 3, 3}),
          new Car(3, 5, new int[]{2, 2, 2}),
          new Car(4, 6, new int[]{2, 2, 3}),
          new Car(2, 4, new int[]{1, 3, 4}),
          new Car(3, 6, new int[]{3, 3, 3}),
          new Car(2, 4, new int[]{2, 2, 2}),
          new Car(4, 6, new int[]{2, 2, 2}),
          new Car(2, 4, new int[]{2, 3, 4}),
          new Car(3, 5, new int[]{3, 3, 3}),
          new Car(4, 6, new int[]{1, 2, 3})
      };

      Car carToSearch1 = new Car(2, 4, new int[]{2, 2, 3});
      binarySearch(cars, carToSearch1);

      Car carToSearch2 = new Car(2, 4, new int[]{2, 2});
      binarySearch(cars, carToSearch2);
  }
}
