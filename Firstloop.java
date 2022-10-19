public class Firstloop {
  public static void main(String[] args) {
    int num;
    for(num = 1; num <= 50; num++){
      if(num % 2 == 1){
        System.out.println("num is an odd number");
        if(num % 5 == 0){
          System.out.println("num is divisible by 5");
          if(num % 11 == 0){
            System.out.println("num is divisible by 11");
          }
        }
      }else if(num % 2 == 0){
        System.out.println("num is an even number");
        System.out.println("num is divisible by 2");
        if(num % 5 == 0){
          System.out.println("num is divisible by 5");
          if(num % 8 == 0){
            System.out.println("num is divisible by 8");
            if(num % 11 == 0){
              System.out.println("num is divisible by 11");
            }
          }
        }
      }
    }
  }
}
