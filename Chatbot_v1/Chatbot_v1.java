import java.util.Scanner;

public class Chatbot_v1{

//Global Variables
public static String[] statement = new String[50];
public static String[] response = new String[49];

public static void main(String[] args)
{
	Scanner in = new Scanner ( System.in );
	System.out.println("\nHello my name is Chatbot"+"\nLet's Talk");

	int i=0;
	double x=0;
	Boolean endChatbot = false;
	String input;
	//Types of Chatbot responses
	String no = "no";
	
	while ( endChatbot == false ) {
		//System.out.println(i);
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
				 statement[i] = "Chatbot: " + "Okay cool\n";
			 }
			System.out.println(response[i]);
			System.out.println(statement[i]);
			//System.out.println(x);
		}
		i++;
  }
}
}
