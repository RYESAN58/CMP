import java.util.Scanner; 


public class ProjectEliza {

	String [] questions;
	String [] statements;
	
  public static String[] ConvertToArray(String x){
    String[] arr = null;

    arr = x.split(" ");
    return arr;
  }
  public static int getRandomNumber(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
  }
	public ProjectEliza(){
		//questions = new String[   ]; //initialize your array to the correct length to match your number of questions you populate it with
		//statements = //initialize your array to the correct length to match your number of questions you populate it with
		
	}

	public static void populateStatementsArray(String first, String second){
    String[] questions;
    int random = getRandomNumber(0,2);
    questions = new String[3];
		questions[0] = "Tell me more about " + first + " and " + second + "";
		questions[1] = "" + first + " seems important to you, so does " + second + ". Please tell me more.";
		questions[2] = "" + first + " and " + second + " seem to be on your mind. Let's talk about it.";
    System.out.println(questions[random] + " ");
	}
	public static void populateQuestionsArray(String first, String second){
    String[] questions;
    int random = getRandomNumber(0,2);
    questions = new String[3];
		questions[0] = "Is there anything else about " + first + " and " + second + "?";
		questions[1] = "Does " + first + " bother you? How about " + second + "?";
		questions[2] = "Are " + first + " and " + second + " things you think about often?";

    System.out.print(questions[random]);
	}
  public static String cont(String s){
    Scanner scnr = new Scanner(System.in);
    System.out.println(s.toLowerCase());
    String answer;
    if(s.equals("EXIT")){
      System.out.println("Do you want to run the session again?");
      answer = scnr.nextLine();
      if(answer.toLowerCase().equals("no")){
        return "no";
      }else{
        return "yes";
      }
    }
    return "yes";
  }
	public static void main(String[] args) {
    String prgrm = "yes";
    Scanner scnr = new Scanner(System.in);
    System.out.println("Hello, my name is Eliza. What is your name?");
    String name = scnr.nextLine();
    prgrm = cont(name);
    System.out.println("Hello " + name + ". Tell me what is on your mind today in 1 sentence.");
    while(prgrm.equals("yes")){
      String sentance = scnr.nextLine();
      prgrm = cont(sentance);
      String[] rWords = ConvertToArray(sentance);
      String first = rWords[0];
      String last = rWords[rWords.length-1];
      int x = last.length()-1;

      if(last.charAt(x) == '?'){
        populateQuestionsArray(first, last);
      }else if(last.charAt(x) == '!'){
        System.out.print("WOW! Dramatic! ");
        populateStatementsArray(first, last);
      }else{
        populateStatementsArray(first, last);
      }
    }
    System.out.println("Goodbye, until next time");
  }
}