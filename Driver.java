package ozlympics;

import java.util.Scanner;
/**
 * 
 * @author Pardon Gumbo
 * StudentID	s3611694
 * Date			06/04/2017
 */

public class Driver {
	
	String sportType;
	int gameNo;
	String athleteID; 
	
	public Driver() {}
	
	public Driver(String sportType, int gameNo) {
		super();
		this.sportType = sportType;
		this.gameNo = gameNo;
	}
	public void userChoice() {
		 
		 int choice;
		
		System.out.println("");
		System.out.println("    O Z L Y M P I C S     G A M E S");
		System.out.println("    ===============================");
		System.out.println("");
		System.out.println("    Make a selection:");
		System.out.println("");
		System.out.println("        1 - Select a game to run ");
		System.out.println("        2 - Predict the winner of the Game");
		System.out.println("        3 - Start the Game");
		System.out.println("        4 - Display the Final Results of All Games");
		System.out.println("        5 - Display the points of All Atheletes");
		System.out.println("        6 - Exit");
		System.out.println("Make your Choice : ");
		Scanner input =  new Scanner(System.in);
		
		System.out.println("");
		choice = input.nextInt();
		if (choice < 1 || choice > 6) {
			System.out.println("Invalid Choice ....");
			System.out.println("Please Enter valid choice...");
			choice = input.nextInt();	
			}
		else
			if (choice == 1){
	    		System.out.println("Choosing a game to run ");
	    	 	Games  game = new Games(); 
	    	   	game.selectGame();
			}
			else if (choice == 2){
				System.out.println("Still under development...");
			}
	   else if (choice == 3)		{
	    	System.out.println("Still under development ...");
	      }
	    else if (choice == 4){
	    	System.out.println("Still to be developed  ...");
	    }
	    else if (choice == 5){
	    	System.out.println("Still under development ...");
	    }
	    else if (choice == 6){
	    	System.out.println("Exiting System");
	    	System.exit(0);
	    } 
	}
}
