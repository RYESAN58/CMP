public class FirstLoop {
  public static void main(String[] args) {
    int num;
    for(num = 1; num <= 50; num++){
      for(int i = 2; i <= 11;i+=3){
        if(i == 2){
          if(num % i == 0){
            System.out.println(num + " is an even number");
            System.out.println(num + " is divisible by 2");
          }else{
            System.out.println(num + " is an odd number");
          }
        }else if (i == 5){
          if(num % 5 == 0){
            System.out.println(num + " is divisible by 5");
          }
          
        }else if (i == 8){
          if(num % 8 == 0){
            System.out.println(num + " is divisible by 8");
          }
          
        }else if (i == 11){
          if(num % 11 == 0){
            System.out.println(num + " is divisible by 11");
          }
        }
      }
    }
  }
}