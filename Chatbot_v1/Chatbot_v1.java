import java.util.Scanner;

public class Chatbot_v1{

//Global Variables
public static String[] statement = new String[50];
public static String[] response = new String[49];

public static void main(String[] args)
{
	Scanner in = new Scanner ( System.in );
	System.out.println("\nHello my name is Chatbot"+"\nLet's Talk");
	//
	statement[statement.length-1] = "\nWe are about to run out of memory" +
									"\nGoodBye.";
	//
	int i=0;
	Boolean endChatbot = false;
	String input;
	while ( endChatbot == false ) {
		//System.out.println(i);
		if ( i >= response.length ) {
			endChatbot = true;
		} else {
			input = in.nextLine();
			response[i] = "\nYou: " + input;
			statement[i] = "Chatbot: " + "Cool tell me more";
			System.out.println(response[i]);
			System.out.println(statement[i]);
		}
		i++;
  }
}
}
