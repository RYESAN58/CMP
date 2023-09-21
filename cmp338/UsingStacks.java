package cmp338;

public class UsingStacks {



  public static int prec(char op){
    switch(op){
      case '*': return 2;
      case '/': return 2;
      case '+': return 1;
      case '^' : return 3;
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


public static int power(int base, int exp){
  int product = 1;

  for(int i = 0; i < exp ; i++){
    product*= base;
  }
  return product;
}
  


  public static String infix2PostFix(String infix){
    stackChar stack = new stackChar(infix.length()/2);
    String postfix = "";
    for(int i = 0; i < infix.length(); i++){
      char op = infix.charAt(i);
      if (isOperator(op)){
        while((!stack.isEmpty()) && prec(stack.top()) >= prec(op) ){
          postfix+=stack.top();
          stack.pop();
        }
        stack.push(op);
      }else if(op == '('){
        stack.push(op);
      }else if(op == ')'){
        while(stack.top() != '('){
          postfix+=stack.top();
          stack.pop();
        }
        stack.pop();
      }
      else{
        postfix+=op;
      }
    }
    while(!stack.isEmpty()){
      postfix+=stack.top();
      stack.pop();
    }
    return postfix;
  }
  public static int postfixEval(String postFix){
    Stack stack = new Stack((postFix.length()/2)+1);
    for(int i=0; i < postFix.length(); i++){
      char op = postFix.charAt(i);
    
      if(isOperator(op)){
        int b = stack.top();   stack.pop();
        int a = stack.top();   stack.pop();
        if(op == '^')     {stack.push(power(a,b));}
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
    return (op == '*') || (op == '/') || (op == '-') || (op == '+') || (op == '^');
  }


  public static void main(String[] args) {
    String infex="(2+3)*4^2+7/3";
    String postfix = infix2PostFix(infex);

    int result = postfixEval(postfix);
    System.out.println(infex + " = " + postfix + " = " + result);
  }
}




// do an infix to postfix function!!!


// convert infix postfix!!