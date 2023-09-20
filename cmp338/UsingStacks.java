package cmp338;

public class UsingStacks {
  public static int postfixEval(String postFix){
    Stack stack = new Stack((postFix.length()/2)+1);
    for(int i=0; i < postFix.length(); i++){
      char op = postFix.charAt(i);
    
      if(isOperator(op)){
        int b = stack.top();   stack.pop();
        int a = stack.top();   stack.pop();
        if(op == '*')     {stack.push(a*b);}
        if(op == '/')     {stack.push(a/b);}
        if(op == '+')     {stack.push(a+b);}
        if(op == '-')     {stack.push(a-b);}
      }else{
        stack.push( op - '0');
      }
    }
    return stack.top();
  }
  public static boolean isOperator(char op){
    return (op == '*') || (op == '/') || (op == '-') || (op == '+');
  }


  public static void main(String[] args) {
    String postfix = "53+425*+4-/";

    int result = postfixEval(postfix);
    System.out.println(result);
  }
}



// do an infix to postfix function!!!


// convert infix postfix!!