
package RockPapScissors2;

import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class RockPapScissors2 {
	//scanner called user public static so available to  all methods/functions
	public static Scanner user = new Scanner(System.in);
	
  


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// call method
				rockPaperScissorsGame(); 
		
	}

	//method
	private static void rockPaperScissorsGame() {
	System.out.println("How many games would you like to play?");
	//track games requested and completed
	int gamesCompleted = 0;
	int gamesRequested = user.nextInt();
	user.nextLine();
	//continue game i
	while(gamesCompleted < gamesRequested) {
		String userChoice = promptUserChoice();
		String computerChoice = promptComputerChoice();
		
		//print results based on the user and computer
		printResults(userChoice, computerChoice);
		
		if(!userChoice.equals(computerChoice)) {
		gamesCompleted ++;
		
		}
	}
	
	System.out.println("Thanks for playing");
}

	private static void printResults(String userChoice, String computerChoice) {
	System.out.println("You chose " + userChoice);
	System.out.println("Computer chose " + computerChoice);
		
	}

	private static String promptComputerChoice() {
		int computerChoiceNum = (int)(Math.random()*3);
		if(computerChoiceNum == 1) {
			return "Rock";
			}else if(computerChoiceNum == 2) {
				return "Paper";
			}else {
				return "Scissors";	
			}		
	}

	private static String promptUserChoice() {
	//generate userChoice
	System.out.println("Choose 1-Rock 2-Paper 3-Scissors ");
	
	int userChoiceNum = user.nextInt();
	
		if(userChoiceNum == 1) {
		return "Rock";
		}else if(userChoiceNum == 2) {
			return "Paper";
		}else {
			return "Scissors";	
		}		
	}
}
