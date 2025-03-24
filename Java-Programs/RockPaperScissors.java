import java.util.Random;
import java.util.Scanner;

/**
This class allows the user to play a rock-paper-scissors game
against the computer.

Eli Frese 3/9/2023
*/
 public class RockPaperScissors
 {
 	/**
	The main method.
 	*/
 	public static void main(String[] args)
 	{
 		int compRPS = computerChoice();
 		String userRPS = userChoice();
 		int result = determineWinner(compRPS, userRPS);
 		displayResults(compRPS, userRPS, result);
 	}


 	/**
	This method creates a random number from 1-3,
	and returns that value to main.
	@return Returns an integer from 1-3.
	*/
 	public static int computerChoice()
 	{
 		// creates the 'random' object
 		Random generator = new Random();

 		// generates a random number correlating to a sign
 		int choice = generator.nextInt(3) + 1;

 		// returns the computer's choice to main
 		return choice;

 	}


 	/**
 	This method gets an input from the user of their choice of sign.
 	@return Returns a string of rock, paper, or scissors.
 	*/
 	public static String userChoice()
 	{
 		// initialize variable to hold user's choice
 		String choice;

 		// creates scanner object
 		Scanner keyboard = new Scanner (System.in);

 		// prints message and takes user input
 		System.out.print("Input 'rock', 'paper', or 'scissors': ");
 		choice = keyboard.nextLine();

 		// return user's choice to main
 		return choice;
 	}


 	/**
	This method determines the winner of the game by comparing
	the user's choice to the computer generated choice.
	@param compSign The computer's choice
	@param userSign The user's choice
	@return Returns an integer that reflects whether the user won,
	lost, or tied.
 	*/
 	public static int determineWinner(int compSign, String userSign)
 	{
 		// compares computer choice with user choice.
 		switch(compSign)
 		{
 			//if computer chose rock
	 		case 1:
	 			// 0 is a loss, 1 is a tie, 2 is a win
	 			switch(userSign)
	 			{
	 				case "rock":
	 					return 1;

	 				case "paper":
	 					return 2;

	 				case "scissors":
	 					return 0;
	 			}	 			

	 		//if computer chose paper
	 		case 2:
	 			// 0 is a loss, 1 is a tie, 2 is a win
	 			switch(userSign)
	 			{
	 				case "rock":
	 					return 0;

	 				case "paper":
	 					return 1;

	 				case "scissors":
	 					return 2;
	 			}


	 		// if computer chose scissors
	 		case 3:
	 			// 0 is a loss, 1 is a tie, 2 is a win
	 			switch(userSign)
	 			{
	 				case "rock":
	 					return 2;

	 				case "paper":
	 					return 0;

	 				case "scissors":
	 					return 1;
	 			}
 		}
 		// return statement needed to compile
 		return -1;	
 	}


 	/**
	This method tells the user their choice, the computer's choice,
	and whether they won, lost, or tied.
	@param compSign The computer's choice
	@param userSign The user's choice
	@param result An integer that reflects whether the user won,
	lost, or tied.
 	*/
 	public static void displayResults(int compSign, 
 		String userSign, int result)
 	{
 		//initialize variable to hold word for the computer's choice
 		String compDisplay="none";

 		//convert compSign integer to words
 		switch(compSign)
 		{
 			case 1:
 				compDisplay = "rock";
 				break;
 			case 2:
 				compDisplay = "paper";
 				break;
 			case 3:
 				compDisplay = "scissors";
 				break;
 		}
 		// print the computer's choice and the user's choice
 		System.out.println("You chose "+userSign+". The computer chose "
 						+compDisplay+".");

 		// print the result of the match as a statement
 		switch(result)
 		{
	 		case 0:
	 			System.out.println("The computer wins.");
	 			break;
	 		case 1:
	 			System.out.println("Tie game.");
	 			break;
	 		case 2:
	 			System.out.println("You win!");
	 			break;
 		}
 	return;
 	}
 }