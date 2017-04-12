package ozlympics;

import java.util.Scanner;
/**
 * 
 * @author Pardon Gumbo
 * StudentID	s3611694
 * Date			06/04/2017
 */

public class SportsType {
	private int sportChoice;
	private String gameChoice;
	
public SportsType(int sportChoice, String gameChoice) {
		super();
		this.sportChoice = sportChoice;
		this.gameChoice = gameChoice;
	}

public int getSportChoice() {
	return sportChoice;
}

public void setSportChoice(int sportChoice) {
	this.sportChoice = sportChoice;
}

public String getGameChoice() {
	return gameChoice;
}

public void setGameChoice(String gameChoice) {
	this.gameChoice = gameChoice;
}

public void selectGame() {
	System.out.println(" ================================== ");
	System.out.println("|        SPORT  SELECTION          |");
	System.out.println("|==================================|");
	System.out.println("| 1.Swimming                       |");
	System.out.println("| 2.Cycling                        |");
	System.out.println("| 3.Running                        |");
	System.out.println("| 0.Exit                           |");
	System.out.println(" ================================== ");
	
	Scanner input =  new Scanner(System.in);
	
	System.out.println("");
	int choice = input.nextInt();
	if (choice < 1 || choice > 3) {
		System.out.println("Please Enter valid choice...");
		choice = input.nextInt();	
		}
	String sport;
    if (choice == 1){
    	Scanner screen = new Scanner(System.in);
    	String gameID = screen.nextLine();
    	String sptchoice =  "swimming";
    }
    else if (choice == 2){
    	Scanner screen = new Scanner(System.in);
    	String gameID = screen.nextLine();
    }
    else if (choice == 3){
    	Scanner screen = new Scanner(System.in);
    	String gameID = screen.nextLine();
    }
    else if (choice == 0){
    	System.exit(0);
    }
  }
}
