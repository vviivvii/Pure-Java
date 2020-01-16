import java.util.Scanner;

public class Chatbot_v1{

//Global Variables
public static String[] statement = new String[50];
public static String[] response = new String[49];

public static void main(String[] args)
{
	Scanner in = new Scanner ( System.in );
	//Chatbot's Greeting
	System.out.println("\n<System> " + "See Dictionary of Responses to talk to Chatbot");
	System.out.println("\nChatbot: " + "Hello my name is Chatbot"+ "\nChatbot: " + "Let's Talk\n");

//Variables
	int i=0;
	double x=0;
	Boolean endChatbot = false;
	String input;
	int nothing = 0;

//What the user can say to the Chatbot
	String no = "no";
	String yes = "yes";
	String chatbot = "chatbot";
	String hello = "hello";
	String mother = "I have a mother";
	String father = "I have a father";
	String sister = "I have a sister";
	String brother = "I have a brother";
	String noResponse = "";

//Chatbot code
	while ( endChatbot == false ) {
		if ( i >= response.length ) {
			endChatbot = true;
		}else if (i == 48) {
			statement[i] = "Chatbot: " + "We are about to run out of memory.\n" + "Chatbot: GoodBye.\n";
			System.out.println(statement[i]);
		} else {
			input = in.nextLine();
			if (i == 15) {
				response[i] = input;
			} else {
				response[i] = "\nYou: " + input;
			}

			//Chatbot's Random Responses.
			 x = ((Math.random() * 5) + 1);
			  if (x >= 2 && x <= 3 ) {
				 statement[i] = "Chatbot: " + "Very nice!\n";
			 }	else if (x <= 2){
				 statement[i] = "Chatbot: " + "Cool tell me more.\n";
			 } else if (x >= 3 && x <= 4){
				 statement[i] = "Chatbot: " + "You don't say.\n";
			 } else if (x >= 4 && x < 5){
				 statement[i] = "Chatbot: " + "Interesting, tell me more.\n";
			 } else if (x >= 5){
				 statement[i] = "Chatbot: " + "Thats cool you like " + input + " right?\n";
			 }
				 /*
				                      							  --|| Chatbot responses ||--
				 *If an input becomes true, Chatbot would have an statement to say and will overight the random response.
				 *If all of the input are false the statement would stay as a random response.

				*/
				if (nothing >= 20) { // If the user said nothing in 20 lines or more the chatbot would ask the user to say something.
 				  statement[i] = "Chatbot: " + "Can you say soemthing?\n";
 			 } if (input.equals(no) == true ) {
				 statement[i] = "Chatbot: " + "That was mean of you.\n";
			 } if (input.equals(yes) == true ) {
 				 statement[i] = "Chatbot: " + "I agree with you too\n";
 			 } if (input.equals(chatbot) == true ) {
 				 statement[i] = "Chatbot: " + "That's my name.\n";
 			 }if (input.equals(hello) == true ) {
 				 statement[i] = "Chatbot: " + "Hello user.\n";
 			 }if (input.equals(mother) == true || input.equals(father) == true) {
 				 statement[i] = "Chatbot: " + "Do they have a job?\n";
			 }if ( input.equals(sister) == true || input.equals(brother) == true) {
 				 statement[i] = "Chatbot: " + "Do they play any sports?\n";
			 }if (i == 30) {
				 statement[i] = "Chatbot: " + "Remember what you said at line 15?\n" + "Chatbot: " + "Can you say it?\n";
			 }if (i == 31) {
				 if (input.equals(statement[15]) == true ){ // Saying it right won't make the statement true [bug]
					 statement[i] = "Chatbot: " + "Your right! Good on you.\n";
				 }else {
					 statement[i] = "Chatbot: " + "Well you said " + response[15] + ".\n";
				 }
			 }



				//If the user is not talking (User keeps on pressing/holding enter) the chatbot would ask the user to say something.
 			 if (input.equals(noResponse) == true ) {
				 nothing++;
			 }else { // The counter would go down by two if the user says something.
				 nothing--;
				 nothing--;
			 }
			//To show the user (response) and chatbot (statement) talking.
			if (i == 15){
				System.out.println("\nYou: " + input);
			}else{
				System.out.println(response[i]);
			}
			System.out.println(statement[i]);
		}
		i++; // add one to change "lines"
  }
 }
}
