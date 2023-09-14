package cmp338;

public class UsingStacks {
  public static int postfixEval(String postFix){
    Stack stack = new Stack((postFix.length()/2)+1);
    for(int i=0; i < postFix.length()-1; i++){
      char op = postFix.charAt(i);
      
      if((op=='0') || (op=='1') ||(op=='2') ||(op=='3') ||(op=='4') ||(op=='5') ||(op=='6') ||(op=='7') ||(op=='8') ||(op=='9')){
        
        stack.push( op - '0');
      }
      if((op== '*' ||op== '/' ||op== '-' ||op== '+')){
        int b = stack.top();   stack.pop();
        
        int a = stack.top();   stack.pop();
        
        if(op == '*')     {stack.push(a*b);}
        if(op == '/')     {stack.push(a/b);}
        if(op == '+')     {stack.push(a+b);}
        if(op == '-')     {stack.push(a-b);}
      }
    }
    return stack.top();
  }


  public static void main(String[] args) {
    String postfix = "53+425*+4-/";

    int result = postfixEval(postfix);
    System.out.println(result);
  }
}



// do an infix to postfix function!!!


// convert infix postfix!!