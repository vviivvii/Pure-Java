import java.util.Scanner;

public class Chatbot_v1{

//Global Variables
public static String[] statement = new String[50];
public static String[] response = new String[49];

public static void main(String[] args)
{
	Scanner in = new Scanner ( System.in );
	System.out.println("<System> " + "See Dictionary of Responses to talk to Chatbot");
	System.out.println("\nChatbot: " + "Hello my name is Chatbot"+ "\nChatbot: " + "Let's Talk\n");

	int i=0;
	double x=0;
	Boolean endChatbot = false;
	String input;
	//Types of Chatbot responses
	String no = "no";
	String chatbot = "chatbot";
	String hello = "hello";
	String mother = "mother";
	String father = "father";
	String sister = "sister";
	String brother = "brother";
	while ( endChatbot == false ) {
		if ( i >= response.length ) {
			endChatbot = true;
		}else if (i == 48) {
			statement[i] = "Chatbot: " + "We are about to run out of memory." +
											"\nChatbot: GoodBye.\n";
			System.out.println(statement[i]);
		} else {
			input = in.nextLine();
			response[i] = "\nYou: " + input;
			 x = ((Math.random() * 4) + 1);
			  if (x >= 2 && x <= 3 ) {
				 statement[i] = "Chatbot: " + "Very nice!\n";
			 }	else if (x <= 2){
				 statement[i] = "Chatbot: " + "Cool tell me more.\n";
			 } else if (x >= 3 && x <= 4){
				 statement[i] = "Chatbot: " + "You don't say.\n";
			 } else if (x >= 4){
				 statement[i] = "Chatbot: " + "Interesting, tell me more.\n";
				 /*
				 || Chatbot responses ||
				*/
			} if (input.equals(no) == true ) {
				 statement[i] = "Chatbot: " + "That was mean of you.\n";
			 } if (input.equals(chatbot) == true ) {
 				 statement[i] = "Chatbot: " + "That's my name.\n";
 			 }
			 if (input.equals(hello) == true ) {
 				 statement[i] = "Chatbot: " + "Hello user.\n";
 			 }
			 if (input.equals(mother) == true || input.equals(father) == true || input.equals(sister) == true || input.equals(brother) == true) {
 				 statement[i] = "Chatbot: " + "Tell me more about your family.\n";
 			 }
			System.out.println(response[i]);
			System.out.println(statement[i]);
		}
		i++;
  }
}
}
