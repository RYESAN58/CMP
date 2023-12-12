package cmp338.notes338;

public class UsingStacks {
  public static int postfixEval(String x){
    int second;
    int first;
    Stack stack = new Stack();
    for(int i =0; i < x.length(); i++){
      if(x.charAt(i) == '*' || x.charAt(i) == '/' || x.charAt(i) == '+' || x.charAt(i) == '-'){
        second = stack.top();
        stack.pop();
        first = stack.top();
        stack.pop();
        stack.push(eval(x.charAt(i), second, first));
        System.out.println(eval(x.charAt(i), second, first));
      }else{
        stack.push(x.charAt(i) - '0');
      }
    }
    System.out.println("answer is " + stack.top());
    return stack.top();
  }

  public static String infix2PostFix(String infix){
    String postFix = "";
    CharStack stack = new CharStack();
    for(int i = 0; i< infix.length(); i++){
      char op = infix.charAt(i);
      if(isOperator(op)){
        if(stack.isEmpty()){
          stack.push(op);
        }else{
          int cur = prec(op);
          if(cur == 0){
            stack.push(op);
          }else{
            postFix += op ;
          }
        }
      }else{
        postFix+=op;
      }
    }
    while(!stack.isEmpty()){
      postFix+= stack.top();
      stack.pop();
    }
    System.out.println("Originally " + infix + " now it's " + postFix );
    return postFix;
  }


  public static boolean isOperator(char op){
    return (op == '*') || (op == '/') || (op == '-') || (op == '+') || (op == '^');
  }
  public static int prec(char top){
    if(top == '*' || top == '/'){
      return 0;
    }else{
      return 1;
    }
  }
  public static int eval(char operation, int second, int first){
    int outcome;
    if(operation == '*'){
      outcome = first * second;
    }else if(operation == '/'){
      outcome = first / second;
    }else if(operation == '-'){
      outcome = first - second;
    }else{
      outcome = first + second;
    }
    return outcome;
  }

  public static void main(String[] args) {
    String postfix = "234*24+8-*+";
    String postfix2 = "53+425*+4-/";

    String postfix3 = "258-43*+2*+";

    String postfix4 = "234*+";


    String infix = "2+3*4";
    String infix2 = "3+7/4*2+8*3+1";

    // postfixEval(postfix);
    // postfixEval(postfix2);
    // postfixEval(postfix3);
    // postfixEval(postfix4);
    infix2PostFix(infix2);
  }
}
