package cmp338;

public class UsingStacks {



  public static int prec(char op){
    switch(op){
      case '*': return 2;
      case '/': return 2;
      case '+': return 1;
      case '-' : return 1;
      default : return 0; 
    }
  }
  public static char check(int x){
    if(x == 6){
      return '*';
    } else if(x == 1){
      return '/';
    } else if(x == 5){
      return '+';
    } else {
      return '-';
    }
}
  


  public static String infix2PostFix(String infix){
    Stack stack = new Stack(infix.length()/2);
    String postfix = "";
    for(int i = 0; i < infix.length(); i++){
      char op = infix.charAt(i);
      if (isOperator(op)){
        int prec = prec(op);
        // 6 = * 1 = / 5 = + - = 3
        if (prec==2){
          int b = stack.top();
        }
        stack.push(0-op);
      }else{
        postfix+=op;
      }
    }
    return "";
  }
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