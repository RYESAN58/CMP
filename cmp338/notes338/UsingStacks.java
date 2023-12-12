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

    postfixEval(postfix);
    postfixEval(postfix2);
    postfixEval(postfix3);
    postfixEval(postfix4);
  }
}
