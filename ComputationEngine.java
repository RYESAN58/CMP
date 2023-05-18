public class ComputationEngine {
    public static int compute(int val1, int val2) {
       int result;
       int i;
    
       result = 1;
       for (i = 0; i < val1; ++i) {
          result *= val2 - 2;
       }
       
       return result;  
    }
     
    public static void main(String[] args) {
       int value1;
       int value2;
       int computedValue;
 
       value1 = 1;
       value2 = 3;
       computedValue = compute(value1, value2);
 
       System.out.println(computedValue);
    }
 }